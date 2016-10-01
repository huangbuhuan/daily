package com.hbh.redistest;

import java.util.Map;

import redis.clients.jedis.Jedis;

import com.hbh.redis.RedisClient;

public class RedisMapJava {
	
	public static void main(String[] args) {
		Jedis jedis=RedisClient.getResource();
		
		String key="user";
		jedis.del(key);
		jedis.hset(key, "name", "czj");
		jedis.hset(key, "age", "15");
		jedis.hset(key, "gender", "mm");
		Map<String,String> user=jedis.hgetAll(key);
		for(Map.Entry<String, String> usercopy:user.entrySet()){
			System.out.println(usercopy.getKey()+":"+usercopy.getValue());
		}
	}

}
