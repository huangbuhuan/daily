package com.hbh.redistest;

import redis.clients.jedis.Jedis;

import com.hbh.redis.RedisClient;

public class MasterSlaveTest {
	public static void main(String[] args) {
		Jedis jedis=RedisClient.getResource();
		System.out.println(jedis.incr("20160720145237320080000000000026"));
		System.out.println(jedis.get("ECS__managePlatFormEmail"));
	}

}
