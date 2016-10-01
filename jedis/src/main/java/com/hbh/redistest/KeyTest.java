package com.hbh.redistest;

import redis.clients.jedis.Jedis;

import com.hbh.redis.RedisClient;

public class KeyTest {
	
	public static void main(String[] args) {
		Jedis jedis=RedisClient.getResource();
		System.out.println(jedis.echo("foo"));
		System.out.println(jedis.exists("foo"));
		System.out.println(jedis.set("key", "value"));
		System.out.println(jedis.echo("key"));
		jedis.close();
	}

}
