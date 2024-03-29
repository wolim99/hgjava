package com.yedam.collection;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExe {
	public static void main(String[] args) {
		Set<String>names = new HashSet<>();
		names.add("홍길동");
		names.add("김길동");
		names.add("손흥민");
		
		names.remove("손흥민");
		
		System.out.println(names.size());
		
		System.out.println("--------------");
		Iterator<String> iter = names.iterator();
		while(iter.hasNext()) { // 가져올 대상이 있는 체크
			String result = iter.next(); // 선택해서 가져옴
			System.out.println(result);
		}
		
		System.out.println("--------------");
		// 확장 for
		for(String name : names) {
			System.out.println(name);
		}
		
		System.out.println("--------------");
		int [] numbers = { 10, 20, 30, 20 } ;
		Set<Integer> set = new HashSet<>();
		for(int i=0; i<numbers.length; i++) {
			set.add(numbers[i]);
		}
		for(int num : set) {
			System.out.println(num);
		}
		
	}
}
