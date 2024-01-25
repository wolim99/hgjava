package com.yedam.api;

import java.util.HashSet;
import java.util.Set;

// hachCode, equals
public class ObjectExe2 {
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		set.add("김길동");
		set.add("박길동");
		set.add("홍길동");
		for(String name : set) { // 자바스크립트 = for  of
		System.out.println(name);
		}
		System.out.println("-----------------------------------");
		Set<Member> members = new HashSet<Member>();
		members.add(new Member("김길동", 20));
		members.add(new Member("홍길동", 22));
		members.add(new Member("박길동", 24));
		members.add(new Member("김길동", 20));
		
		for(Member mem : members) {
			System.out.println(mem.toString());
		}
	}
}
