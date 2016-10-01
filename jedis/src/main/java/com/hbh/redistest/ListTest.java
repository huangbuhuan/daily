package com.hbh.redistest;

import java.util.List;

import redis.clients.jedis.Jedis;

import com.hbh.redis.RedisClient;

public class ListTest {
	
	public static void main(String[] args) {
		Jedis jedis=RedisClient.getResource();
		jedis.flushDB();
		jedis.rpush("user", "name");
		jedis.rpush("user", "age");
		jedis.rpush("user", "sex");
		//包含2
		List<String> user=jedis.lrange("user", 0, 2);
		System.out.println(user);
		jedis.flushDB();
		jedis.rpush("sql", "mysql");
		jedis.rpush("sql", "mongodb");
		jedis.rpush("sql", "redis");
		//获取列表长度
		System.out.println(jedis.llen("sql"));
		//排序
		//System.out.println();
		jedis.lset("sql", 0, "oracle");
		//获取下标为某list下标为0的值
		System.out.println(jedis.lindex("sql", 0));
		//删除数据
		System.out.println(jedis.lrem("sql", 1,"mongodb"));
		System.out.println(jedis.lindex("sql", 1));
		jedis.rpush("sql", "s");
		//删除区间以外的
		System.out.println(jedis.ltrim("sql", 0, 1));
		
		System.out.println(jedis.rpush("sql", "mongodb"));
		//判断是否存在，存在则弹栈
		System.out.println(jedis.rpushx("lll", "mongodb"));
		//弹出尾元素
		jedis.rpop("sql");
		//弹出头元素
		jedis.lpop("sql");
		//尾部进栈
		jedis.rpush("sql", "mysql");
		//头部进栈
		jedis.lpush("sql", "linput");
	}

}
