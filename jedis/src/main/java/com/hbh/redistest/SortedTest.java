package com.hbh.redistest;

import java.util.List;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.SortingParams;

import com.hbh.redis.RedisClient;

public class SortedTest {
	
	public static void main(String[] args) {
		Jedis jedis = new RedisClient().getResource();
		jedis.hset("userrr1", "name1", "hanjie");
        jedis.hset("userrr1", "name2", "hanjie");
        jedis.hset("userrr1", "name3", "86");
        jedis.hset("userrr1", "name4", "x86");
        jedis.sadd("userr1", "a");
        jedis.sadd("userr2", "n");
        jedis.sadd("userr3", "b");
        jedis.sadd("userr4", "n");
        jedis.lpush("ml", "12");
        jedis.lpush("ml", "11");
        jedis.lpush("ml", "23");
        jedis.lpush("ml", "13");
    
        SortingParams sortingParameters = new SortingParams();
        sortingParameters.get("userr*");
        List<String> result=jedis.sort("ml", sortingParameters);
        for(String item:result){
            System.out.println("item...."+item);
        }
	}
}
