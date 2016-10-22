package com.hbh.container;

import java.util.SortedSet;

import com.hbh.generic.New;

public class AssociavtiveArray<K, V> {
	private Object[][] pairs;
	private int index;
	public AssociavtiveArray(int length) {
		pairs = new Object[length][2];
	}
	public void put(K key, V value) {
		if(index >= pairs.length) {
			throw new ArrayIndexOutOfBoundsException();
		}
		pairs[index++] = new Object[]{key, value};
	}
	@SuppressWarnings("uncheked")
	public V get(K key) {
		for(int i = 0; i < index; i++) {
			if(key.equals(pairs[i][0])) {
				return (V)pairs[i][1];
			}
		}
		return null;
	}
	public String toString() {
		StringBuilder result = new StringBuilder();
		for(int i = 0; i < index; i++) {
			result.append(pairs[i][0].toString());
			result.append(" ");
			result.append(pairs[i][1].toString());
			if(i < index - 1) {
				result.append("\n");
			}
		}
		return result.toString();
	}
	public static void main(String[] args) {
		AssociavtiveArray<String, String> map = new AssociavtiveArray<>(3);
		map.put("sky", "blue");
		map.put("grass", "green");
		map.put("ocean", "dancing");
		try {
			map.put("erro", "erro");
		} catch (Exception e) {
			System.out.println("too many object");
		}
		System.out.println(map);
		System.out.println(map.get("sky"));
	}
}
