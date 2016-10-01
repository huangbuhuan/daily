package com.hbh.redistest;

import java.util.List;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Pipeline;

import com.hbh.redis.RedisClient;

public class PipelineTest {
	public static void main(String[] args) {
		Jedis jedis=RedisClient.getResource();
		Pipeline pipeline=jedis.pipelined();
		for(int i=1;i<3;i++){
			pipeline.hmget("a:"+i, "collect","visitor","raisedAmount");
		}
		List<Object> strs=pipeline.syncAndReturnAll();
		for(Object object:strs){
			System.out.println(object);
		}
	}

}
