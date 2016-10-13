package com.hbh.redistest;

import com.hbh.redis.RedisClient;

import redis.clients.jedis.Jedis;

public class Test {	
	public static void main(String[] args) {
		Jedis jedis = RedisClient.getResource();
		jedis.hset("user88", "age", "4294967295111");
		try {
			jedis.hincrBy("user88", "age", 1l);
		} catch (Exception e) {
			System.out.println("出现异常");
		}
	}
}
