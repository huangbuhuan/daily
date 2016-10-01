package com.hbh.redistest;

import redis.clients.jedis.Client;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.Transaction;

import com.hbh.redis.RedisClient;

public class MultiTest {
	
	public static void main(String[] args) {
		Jedis jedis=RedisClient.getResource();
		
		Transaction transaction=new Transaction(new Client());
		jedis.multi();
	}

}
