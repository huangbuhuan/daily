package com.hbh.redistest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.SortingParams;

import com.hbh.redis.RedisClient;

public class HashTest {
	
	public static void main(String[] args) {
		Jedis jedis=RedisClient.getResource();
		
        jedis.hset("user11", "name", "2");
        SortingParams sortingParams = new SortingParams();
        jedis.hset("user:22", "add", "shanghai");  
        jedis.hset("user:33", "add", "guangzhou");  
        jedis.hset("user:55", "add", "chongqing");  
        jedis.hset("user:66", "add", "xi'an");
        jedis.lpush("user:22", "1");
        jedis.lpush("user:22", "2");
        jedis.lpush("user:22", "3");
        jedis.lpush("user:22", "4");
        sortingParams.desc();
        sortingParams.nosort(); 
        List<String> str=jedis.sort("user:22", sortingParams);
        System.out.println(str);
		List<List<String>> lists = new ArrayList<List<String>>();
		List<String> strs = new ArrayList<String>();
		strs.add("a");
		strs.add("b");
		List<String> strs1 = new ArrayList<String>();
		strs1.add("c");
		strs.add("d");
		lists.add(strs);
		lists.add(strs1);
		for(int i=0; i < lists.size(); i++) {
			for(int j=0; j < lists.get(i).size(); j++) {
				jedis.hset("nbr", ""+i+j, lists.get(i).get(j));
			}
		}
		jedis.hgetAll("nbr");
		List<String> list=jedis.lrange("nbr1", 0 ,-1 );
		System.out.println(list);
		jedis.hset("aaa", "bbb", "0");
		System.out.println(jedis.hincrBy("aaa", "bbb", 2));
		Map<String,String> user=new HashMap<String,String>();
		user.put("name", "czj");
		user.put("age", "10");
		user.put("gender", "man");
		user.put("like", "lol");
		user.put("gender", "mm");
		jedis.hmset("user", user);
		System.out.println(jedis.exists("user"));
		System.out.println(jedis.exists("user"+1));
		//获取key为name的元素
		System.out.println(jedis.hmget("user", "name"));
		//统计元素个数
		System.out.println(jedis.hlen("user"));
		//是否存在
		System.out.println(jedis.exists("user"));
		//获取所有的key
		System.out.println(jedis.hkeys("user"));
		//获取所有的value
		System.out.println(jedis.hvals("user"));
		for(Map.Entry<String, String> user1:user.entrySet()){
			System.out.println(user1.getKey()+":"+user1.getValue());
		}
		//获取map中符合key的值
		System.out.println(jedis.hmget("user", "name","age","gender"));
		//删除指定的key
		System.out.println(jedis.hdel("user", "name"));
		//判断指定的key是否存在
		System.out.println(jedis.hexists("user", "name"));
		//某值增加如果不存在创建一个新的key-value
		System.out.println(jedis.hincrBy("user", "key", 1234));
		System.out.println(jedis.hincrBy("user", "key", 11));
		//如果map的key存在不更新value并放回0
		System.out.println(jedis.hsetnx("user", "name", "123"));
		jedis.close();
	}

}
