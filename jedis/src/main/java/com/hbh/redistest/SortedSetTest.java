package com.hbh.redistest;

import redis.clients.jedis.Jedis;

import com.hbh.redis.RedisClient;
/**
 * 有序集合
 * @author Administrator
 *
 */
public class SortedSetTest {
	
	public static void main(String[] args) {
		Jedis jedis =RedisClient.getResource();
		jedis.flushDB();
		jedis.zadd("sql", 22, "redis");
		jedis.zadd("sql", 23, "mysql");	
		jedis.zadd("sql", 2, "mongodb");
		jedis.zadd("sql", 1, "oracle");
		//从小到大
		System.out.println(jedis.zrange("sql", 0, -1));
		//从大到小
		System.out.println(jedis.zrevrange("sql", 0, -1));
		//统计所有的个数
		System.out.println(jedis.zcard("sql"));
		//查询元素的下标
		System.out.println(jedis.zscore("sql", "11"));
		//统计10-30下标的元素个数
		System.out.println(jedis.zcount("sql", 10, 30));
	}

}
