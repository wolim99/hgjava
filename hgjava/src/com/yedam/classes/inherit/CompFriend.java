package com.yedam.classes.inherit;

import lombok.Data;

@Data
public class CompFriend extends Friend{
	// 회사, 부서
	private String company;
	private String dept;
	
	@Override
	public void changeInfo(String info1, String info2) {
		this.company = info1;
		this.dept = info2;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", 회사는" + company + ", 부서는 " + dept;
	}
}
