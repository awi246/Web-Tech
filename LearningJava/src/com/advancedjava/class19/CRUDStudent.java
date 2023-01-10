package com.advancedjava.class19;

import java.util.ArrayList;
import java.util.List;

public class CRUDStudent {
	public static void main(String[] args) {
		
		List<Student> slist = new ArrayList<Student>();
		
		Student student1 = new Student();
		student1.setRollNo(1);
		student1.setName("Ram Pandey");
		student1.setAddress("Kapan");
		student1.setPhoneNo("123456666");
		slist.add(student1);
		

		student1.setRollNo(2);
		student1.setName("Shyam Pandey");
		student1.setAddress("Chabahil");
		student1.setPhoneNo("176346789");
		slist.add(student1);
		
		for(Student student : slist) {
			System.out.println("Name :"+student.getName());
			System.out.println(student.getAddress());
			System.out.println(student.getPhoneNo());
			System.out.println(student.getRollNo());
			System.out.println("\n");
		}
		
		slist.remove(1);
		System.out.println("After removed index 1");
		for(Student student : slist) {
			System.out.println("Name :"+student.getName());
			System.out.println(student.getAddress());
			System.out.println(student.getPhoneNo());
			System.out.println(student.getRollNo());
			System.out.println("\n");
		}
		
	}

}
