package com.hbh.redistest;

import java.util.Date;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Pipeline;

import com.hbh.redis.RedisClient;

public class EfficiencyTest {
	
	public static void main(String[] args) {
		Jedis jedis=RedisClient.getResource();
		long startTime=new Date().getTime();
		for(int i=0;i<10;i++){
			jedis.set("user"+i, i+"");
			System.out.println(jedis.get("user"+i));
		}
		long endTime=new Date().getTime();
		System.out.println(endTime-startTime);
		jedis.flushDB();
		Pipeline pipeline=jedis.pipelined();
		long startTime1=new Date().getTime();
		for(int i=0;i<10;i++){
			pipeline.set("user"+i, i+"");
			System.out.println(pipeline.get("user"+i));
		}
		long endTime1=new Date().getTime();
		System.out.println(endTime1-startTime1);
	}

}
