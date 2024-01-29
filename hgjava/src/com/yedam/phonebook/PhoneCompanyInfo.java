package com.yedam.phonebook;

import java.net.FileNameMap;

public class PhoneCompanyInfo extends PhoneInfo {
	String company;

	public PhoneCompanyInfo(String name, String phone, String company) {
		super(name, phone); // super = 부모생성자에서 들고오는것
		this.company = company;
	}

	@Override
	public void showPhoneInfo() {
		super.showPhoneInfo();
		System.out.println("company: " + company);
	}

	@Override
	public String toString() {
		return InputSelect.COMPANY + "," + getName() + "," + getPhone() + "," + company;
	}
}
