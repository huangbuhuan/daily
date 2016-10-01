package com.hbh.redistest;


import redis.clients.jedis.Jedis;

import com.hbh.redis.RedisClient;

public class RedisStringJava {
	
	public static void main(String[] args) {
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
		jedis.set("sql", "redis");
		//先获取再修改
		System.out.println(jedis.getSet("sql", "oracle"));
		System.out.println(jedis.get("sql"));
		//截取包含1和3
		System.out.println(jedis.getrange("sql", 1, 3));
		
	}
	

}
