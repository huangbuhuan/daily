package com.hbh.redisinaction;

import java.util.Date;

import redis.clients.jedis.Jedis;

public class Articlesort {
	public static int ONE_WEEK_IN_SECONDS=7*86400;
	public static String VOTE_SCORE="432";
	public static void articleVote(Jedis jedis,String user,Article article){
		int cutoff=new Date().getDate()-ONE_WEEK_IN_SECONDS;
		if(jedis.zscore("time:","article" ) < cutoff)
				return;
		String articleId=article.getId();
		if(jedis.sadd("voted"+articleId, user)>0){
			jedis.zincrby("score", article.getScore(), VOTE_SCORE);
			jedis.hincrBy(article.getId(), "votes", 1);
		}
	}

}
