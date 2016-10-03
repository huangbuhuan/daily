package com.hbh.collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class QueueDemo {
	
	public static void printQueue(Queue queue) {
		while(null != queue.peek()) {
			System.out.println(queue.remove() + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();
		Random rand = new Random(47);
		for(int i = 0; i < 10; i++) {
			//添加一个元素
			queue.offer(rand.nextInt(10));
		}
		System.out.println(queue);
		Queue<Character> qc = new LinkedList<Character>();
		for (char c : "Docker".toCharArray()) {
			qc.offer(c);
		}
		System.out.println(qc);
	}

}
