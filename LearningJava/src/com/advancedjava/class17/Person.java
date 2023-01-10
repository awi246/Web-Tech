package com.advancedjava.class17;

public class Person {
		
	private String name;
	private String gender;
	private String address;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void getInfo(int age) {
		System.out.println("Name of the person: "+getName());
		System.out.println("Gender: "+getGender());
		System.out.println("Address: "+getAddress());
		System.out.println("Age: "+age);
	}
	
	
}
