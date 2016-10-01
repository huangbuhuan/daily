package com.hbh.redistest;

import redis.clients.jedis.Jedis;

import com.hbh.redis.RedisClient;

public class OtherTest {
	
	public static void main(String[] args) {
		Jedis jedis =RedisClient.getResource();
		//返回库中所有的key
		System.out.println(jedis.keys("*"));
		//删除
		System.out.println(jedis.del("."));
		//返回有效时间-1永久有效
		System.out.println(jedis.ttl("sql"));
		//设置过期时间
		jedis.setex("sql", 1, "*");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(jedis.keys("*"));
		jedis.set("sql", "mysql");
		//修改key名
		jedis.rename("sql", "redis");
		System.out.println(jedis.get("redis"));
		jedis.lpush("user", "1");
		jedis.lpush("user","10");
		jedis.rpush("user", "8");
		System.out.println(jedis.lrange("user", 0, -1));
		//返回排序后的结果，原队列没改变
		System.out.println(jedis.sort("user"));
		System.out.println(jedis.lrange("user", 0, -1));
	}
}
