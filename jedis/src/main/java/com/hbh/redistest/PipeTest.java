package com.hbh.redistest;

import java.util.Date;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Pipeline;

import com.hbh.redis.RedisClient;

public class PipeTest {
		public static void main(String[] args) {
			Jedis jedis=RedisClient.getResource();
			
			Pipeline pipe=jedis.pipelined();
			long startTime=new Date().getTime();
			for(int i=0;i<100000;i++){
				pipe.set("sql"+i, i+"");
				System.out.println(pipe.get("sql"+i));
			}
			long endTime=new Date().getTime();
			System.out.println(endTime-startTime);
			RedisClient.returnResource(jedis);
		}
}
