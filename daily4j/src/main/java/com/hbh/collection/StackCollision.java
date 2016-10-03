package com.hbh.collection;

import java.util.Stack;

public class StackCollision {
	
	public static void main(String[] args) {
		Stack<String> strs = new Stack<String>();
		for(String str : "My dog has fear".split(" ")) {
			strs.push(str);
		}
		while(!strs.isEmpty()) {
			System.out.print(strs.pop() + " ");
		}
		//练习
		Stack<Character> characters = new Stack<Character>();
		String string = "+U+n+c---+e+r+t---+a-+i-+n+t+y---+-+r+u--+l+e+s---";
		char[] chars = string.toCharArray();
		for(int i = 0; i < chars.length; i++){
			if('+' == chars[i]){
				characters.push(chars[++i]);
				System.out.println(characters);
			}else if('-' == chars[i]) {
				characters.pop();
				System.out.println(characters);
			}
		}
	}

}
