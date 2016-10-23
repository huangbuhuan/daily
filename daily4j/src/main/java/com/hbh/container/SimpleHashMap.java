package com.hbh.container;

import java.util.AbstractMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

public class SimpleHashMap<K, V> extends AbstractMap<K, V> {
	static final int SIZE = 997;
	@SuppressWarnings("uncheked")
	LinkedList<MapEntry<K, V>>[] buckets = new LinkedList[SIZE];
	public V put(K key, V value) {
		V oldValue = null;
		int index = Math.abs(key.hashCode()) % SIZE;
		//为空创建一个新的链表
		if(buckets[index] == null) {
			buckets[index] = new LinkedList<MapEntry<K, V>>();
		}
		LinkedList<MapEntry<K, V>> bucket = buckets[index];
		MapEntry<K, V> pair = new MapEntry<K, V>(key, oldValue);
		boolean found = false;
		ListIterator<MapEntry<K, V>> it = bucket.listIterator();
		//遍历, 如果key存在就重新设值, 并将标记设为true
		while(it.hasNext()) {
			MapEntry<K, V> iPair = it.next();
			if(iPair.getKey().equals(key)) {
				it.set(pair);
				found = true;
				break;
			}
		}
		//key不存在, 往链表中添加一个对象
		if(!found) {
			buckets[index].add(pair);
		}
		return oldValue;
	}
	public V get(Object key) {
		int index = Math.abs(key.hashCode()) % SIZE;
		if(buckets[index] == null) {
			return null;
		}
		for(MapEntry<K, V> iPair : buckets[index]) {
			if(iPair.getKey().equals(key)) {
				return iPair.getValue();
			}
		}
		return null;
	}
	@Override
	public Set<java.util.Map.Entry<K, V>> entrySet() {
		Set<Map.Entry<K, V>> set = new HashSet<Map.Entry<K, V>>();
		//遍历数组, 往set添加key, 添加完成后返回Set
		for(LinkedList<MapEntry<K, V>> bucket : buckets) {
			if(bucket == null) {
				continue;
			}
			for(MapEntry<K, V> pair : bucket) {
				set.add(pair);
			}
		}
		return set;
	}
	public static void main(String[] args) {
		SimpleHashMap<String, String> map = new SimpleHashMap<>();
	}
	
}
