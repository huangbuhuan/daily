package com.rookie.iptoredis;

import java.io.File;

import org.junit.Test;

import com.hbh.redis.RedisClient;

import redis.clients.jedis.Jedis;

public class MyTest {
	
	@Test
	public void test1(){
		Jedis jedis = RedisClient.getResource();
		Data2Redis data2Redis = new Data2Redis();
		data2Redis.ipToRedis(jedis, new File(Config.GEOLITECITY_BLOCKS));
		RedisClient.returnResource(jedis);
	}
	@Test
	public void test2(){
		Jedis jedis = RedisClient.getResource();
		Data2Redis data2Redis = new Data2Redis();
		data2Redis.citiesToRedis(jedis, new File(Config.GEOLITECITY_LOCATION));
		RedisClient.returnResource(jedis);
	}
	
	@Test
	public void test3(){
		Jedis jedis = RedisClient.getResource();
		Data2Redis data2Redis = new Data2Redis();
		City city= data2Redis.findByIp(jedis, "115.192.111.140");
		if(null == city){
			System.out.println("没有找到对应的ip");
			return;
		}
		System.out.println(city.getRegion());
		RedisClient.returnResource(jedis);
	}

}
