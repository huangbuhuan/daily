package com.hbh.redistest;


import org.junit.Test;

import redis.clients.jedis.Jedis;

import com.hbh.redis.RedisClient;

public class RedisTest {

	@Test
	public void test() {
		Jedis jedis=RedisClient.getResource();
		jedis.set("name", "czj");
		System.out.println(jedis.get("name"));
		jedis.append("name", "csb");
		System.out.println(jedis.get("name"));
		jedis.set("name", "ccl");
		System.out.println(jedis.get("name"));
		jedis.del("name");
		System.out.println(jedis.get("name"));
		//mset(key,value,key,value);
		jedis.mset("name","ccl","czj","lqz");
		System.out.println(jedis.get("name"));
		System.out.println(jedis.get("czj"));
	}

}
