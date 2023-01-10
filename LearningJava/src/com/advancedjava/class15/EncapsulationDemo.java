package com.advancedjava.class15;

public class EncapsulationDemo {

	public static void main(String[] args) {
			Student student = new Student();
			student.setName("Manoj Khatri");
			
			
			String name = student.getName();
			
			System.out.println("Name :"+name);
	}

}
