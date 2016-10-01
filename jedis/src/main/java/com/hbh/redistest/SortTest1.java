package com.hbh.redistest;

import java.util.List;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.SortingParams;

import com.hbh.redis.RedisClient;

public class SortTest1 {
	
	public static void main(String[] args) {
		Jedis jedis =RedisClient.getResource();
		jedis.flushDB();
		jedis.lpush("user", "1");
		jedis.lpush("user", "2");
		jedis.rpush("user", "6");
		jedis.rpush("user", "5");
		System.out.println(jedis.lrange("user", 0, -1));
		//用于排序
		SortingParams sortingParams=new SortingParams();
		//倒序
		sortingParams.desc();
		//分页
		sortingParams.limit(0, 2);
		List<String> users=jedis.sort("user", sortingParams);
		System.out.println(users);
		jedis.flushDB();
		jedis.lpush("user", "czj");
		jedis.lpush("user", "ccl");
		jedis.rpush("user", "lt");
		jedis.rpush("user", "jru");
		//value为字符串时使用alpha
		sortingParams.alpha();
		System.out.println(jedis.sort("user",sortingParams));
	}

}
