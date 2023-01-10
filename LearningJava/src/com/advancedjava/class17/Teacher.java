package com.advancedjava.class17;

public class Teacher extends Person{
	
	public void getInfo(int age) {
		
		setName("Manoj");                                                                          
		setAddress("Kathmandu");
		setGender("Male");
		
		System.out.println("Name of the person: "+getName());
		System.out.println("Gender: "+getGender());
		System.out.println("Address: "+getAddress());
		System.out.println("Age: "+age);
	}
		
}
