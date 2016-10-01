package com.hbh.redistest;

import com.hbh.redis.RedisClient;

import redis.clients.jedis.Pipeline;

public class PipeLine1Test {
	
	public static void main(String[] args) {
		Pipeline pipeline = RedisClient.getResource().pipelined();
		for(int i = 1; i <= 3 ;i++){

		}
	}

}
