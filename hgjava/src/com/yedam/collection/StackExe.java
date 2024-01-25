package com.yedam.collection;

import java.util.Stack;

public class StackExe {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		stack.push("홍길동");
		stack.push("김민석");
		stack.push("최만석");
		
		stack.pop();
		
		while(!stack.isEmpty()) {
			String result =  stack.pop(); //String result =  stack.peek(); - pop을 peek로 바꿔서 하면 무한루프
			System.out.println(result);
		}
		
		// home -> product -> sell -> 시점
		
	}
}
