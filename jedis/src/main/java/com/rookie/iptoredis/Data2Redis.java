package com.rookie.iptoredis;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.List;
import java.util.Set;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import com.google.gson.Gson;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Pipeline;

public class Data2Redis {
	
	public long toSore(String ipAddress){
		long score=0;
		for(String str:ipAddress.split("\\."))
			score= score*256 + Integer.parseInt(str, 10);
		return score;
	}
	
	public void ipToRedis(Jedis jedis,File file){
		Pipeline pipeline=jedis.pipelined();
		try {
			System.out.println("导入ip地址开始");
			long startTime=System.currentTimeMillis();
			Reader reader=new FileReader(file);
			CSVParser parser=new CSVParser(reader,CSVFormat.newFormat(',') );
			List<CSVRecord> list=parser.getRecords();
			for(CSVRecord record : list ){
				long num=record.getRecordNumber();
				if(num<3)
					continue;
				pipeline.zadd(Config.IP2CITYID,Long.valueOf(replaceSprit(record.get(0))),replaceSprit(record.get(2))+"_0");  
				pipeline.zadd(Config.IP2CITYID,Long.valueOf(replaceSprit(record.get(1))),replaceSprit(record.get(2))+"_1");    
			}
			pipeline.syncAndReturnAll();
			parser.close();
			reader.close();
			long endTime=System.currentTimeMillis();
			System.out.println("------------");
			System.out.println("导入ip地址完成");
			System.out.println("耗时："+(endTime-startTime));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void citiesToRedis(Jedis jedis,File file){
		Gson gson=new Gson();
		Pipeline pipeline=jedis.pipelined();
		try {
			System.out.println("导入城市地址开始");
			long startTime=System.currentTimeMillis();
			Reader reader =new FileReader(file);
			CSVParser parser=new CSVParser(reader,CSVFormat.newFormat(',') );
			List<CSVRecord> list=parser.getRecords();
			City city=new City();
			for(CSVRecord record : list){
				long num=record.getRecordNumber();
				if(num<3)
					continue;
				record2City(city, record);
				pipeline.hset(
						Config.CITYID2CITY, 
						city.getCityId(),
						gson.toJson(city));
			}
			pipeline.syncAndReturnAll();
			parser.close();
			reader.close();
			long endTime=System.currentTimeMillis();
			System.out.println("------------");
			System.out.println("导入城市地址完成");
			System.out.println("耗时："+(endTime-startTime));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void record2City(City city, CSVRecord record){
		city.setCityId(replaceSprit(record.get(0)));
		city.setCountry(replaceSprit(record.get(1)));
		city.setRegion(replaceSprit(record.get(2)));
		city.setCity(replaceSprit(record.get(3)));
		city.setPostalCode(replaceSprit(record.get(4)));
		city.setLatitude(replaceSprit(record.get(5)));
		city.setLongitude(replaceSprit(record.get(6)));
		city.setMetroCode(replaceSprit(record.get(7)));
		city.setAreaCode(replaceSprit(record.get(8)));
	}
	
	public City findByIp(Jedis jedis,String ip){
		long score=toSore(ip);
		score = 94795776l;
		Set<String> results=jedis.zrangeByScore(Config.IP2CITYID, score,score);
		if(0 == results.size())
			return null;
		String cityId = results.iterator().next();
		cityId = cityId.substring(0, cityId.indexOf('_'));
		return  new Gson().fromJson(jedis.hget(Config.CITYID2CITY, cityId), City.class);  
	}
	
	private String replaceSprit(String str){
		return str.replaceAll("\"", "");
	}

}
