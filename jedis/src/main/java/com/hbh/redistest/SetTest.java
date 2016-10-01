package com.hbh.redistest;

import java.util.Set;

import redis.clients.jedis.Jedis;

import com.hbh.redis.RedisClient;
/**
 * 无序集合
 * @author Administrator
 *
 */
public class SetTest {
	
	public static void main(String[] args) {
		Jedis jedis=RedisClient.getResource();
		jedis.flushDB();
		jedis.sadd("sql", "mysql");
		jedis.sadd("sql", "redis");
		jedis.sadd("sql", "mongodb");
		jedis.sadd("sql", "oracle");
		Set<String>sql=jedis.smembers("sql");
		System.out.println(sql);
		//移除指定元素
		jedis.srem("sql", "redis");
		//输出全部set的值
		Set<String>sqls=jedis.smembers("sql");
		System.out.println(sqls);
		//判断set是否存在
		System.out.println(jedis.sismember("sql", "mysql"));
		//返回集合元素总数
		System.out.println(jedis.scard("sql"));
		
		jedis.sadd("sql2", "mysql");
		jedis.sadd("sql2", "redis");
		jedis.sadd("sql2", "sql");
		//交集
		System.out.println(jedis.sinter("sql","sql2"));
		//并集
		System.out.println(jedis.sunion("sql","sql2"));
		//差集
		System.out.println(jedis.sdiff("sql2","sql"));
		
	}

}
