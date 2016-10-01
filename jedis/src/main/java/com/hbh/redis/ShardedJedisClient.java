package com.hbh.redis;

import org.apache.commons.pool2.impl.GenericObjectPoolConfig;

import redis.clients.jedis.JedisShardInfo;
import redis.clients.jedis.ShardedJedisPool;
import redis.clients.jedis.ShardedJedis;

public class ShardedJedisClient {
	
	static{
		GenericObjectPoolConfig jedisPoolConfig=new GenericObjectPoolConfig();
		jedisPoolConfig.setMaxTotal(RedisConfig.MAX_ACTIVE);
		jedisPoolConfig.setMaxWaitMillis(RedisConfig.MAX_WAIT);
		jedisPoolConfig.setMaxIdle(RedisConfig.MAX_IDLE);
		jedisPoolConfig.setTestOnBorrow(RedisConfig.TEST_ON_BORROW);
//		ShardedJedisPool shardedJedisPool = new ShardedJedisPool(jedisPoolConfig);
		JedisShardInfo jedisShardInfo = new JedisShardInfo("192.168.3.199", 6379);
	}

}
