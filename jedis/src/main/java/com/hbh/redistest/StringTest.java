package com.hbh.redistest;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Transaction;

import com.hbh.redis.RedisClient;

public class StringTest {
	
	public static void main(String[] args) {
		Jedis jedis=RedisClient.getResource();
		jedis.set("hello", "world");
		System.out.println(jedis.get("hello"));
		jedis.flushDB();
		jedis.set("name", "czj");
		System.out.println(jedis.get("name"));
		jedis.setnx("name", "ccl");
		System.out.println(jedis.get("name"));
		jedis.set("name", "ccl");
		System.out.println(jedis.get("name"));
		//追加
		jedis.append("name", "csb");
		System.out.println(jedis.get("name"));
		jedis.flushDB();
		//设置过期时间，单位秒
		jedis.setex("sql",1 , "mysql");
		System.out.println(jedis.get("sql"));
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(jedis.get("sql"));
		//设置多个user key-value形式只建立一次连接在设置多个值时比多次set更节省时间
		jedis.mset("user1","1","user2","2","user3","3");
		//mget返回list集合
		System.out.println(jedis.mget("user1","user2","user3"));
	}

}
