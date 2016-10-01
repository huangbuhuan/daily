package com.hbh.redistest;

import redis.clients.jedis.Jedis;

import com.hbh.redis.RedisClient;

public class HashEfficiencyTest {

	public static void main(String[] args) {
		Jedis jedis=RedisClient.getResource();
		long startTime=System.currentTimeMillis();
		for(int i=0;i<100000;i++){
			jedis.hset("user"+i, "name"+i, "value"+i);
			System.out.println(jedis.hget("user"+i, "name"+i));
		}
		long endTime=System.currentTimeMillis();
		System.out.println(endTime-startTime);
	}
}
