package com.hbh.redistest;

import java.util.List;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.SortingParams;

import com.hbh.redis.RedisClient;

public class SortTests2 {
	public static void main(String[] args) {
		Jedis jedis=RedisClient.getResource();
		jedis.flushDB();
		jedis.lpush("users", "12");
		jedis.lpush("users", "15");
		jedis.rpush("users", "22");
		jedis.rpush("users", "1");
		
		jedis.hset("user:1", "name", "11");
		jedis.hset("user:2", "name", "22");
		jedis.hset("user:3", "name", "33");
		jedis.hset("user:4", "name", "33");
		jedis.hset("user:5", "add", "33");
		jedis.hset("user:6", "add", "22");
		jedis.hset("user:7", "add", "11");
		
		SortingParams sortingParams=new SortingParams();
		sortingParams.by("user:*->name");
//		sortingParams.get("user:*->add");
		List<String> users=jedis.sort("users",sortingParams);
		System.out.println(users);
		RedisClient.returnResource(jedis);
	}

}
