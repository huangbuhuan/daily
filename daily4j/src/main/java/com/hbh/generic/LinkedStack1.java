package com.hbh.generic;

/**
 * 内部类可以使用外部类的类型参数
 * @author hbh
 *
 * @param <T>
 */
public class LinkedStack1<T> {

	private class Node {

		T item;
		Node next;

		Node() {
			item = null;
			next = null;
		}

		Node(T item, Node next) {
			this.item = item;
			this.next = next;
		}

		boolean end() {
			return item == null && next == null;
		}
	}

	private Node top = new Node();

	public void push(T item) {
		top = new Node(item, top);
	}

	public T pop() {
		T result = top.item;
		if (!top.end())
			top = top.next;
		return result;
	}

	public static void main(String[] args) {
		LinkedStack<String> ls = new LinkedStack<String>();
		ls.push("1");
		ls.push("2");
		ls.push("3");
		String s = null;
		while ((s = ls.pop()) != null) {
			System.out.println(s);
		}
	}

}
