package com.advancedjava.class18;

import java.util.ArrayList;
import java.util.List;

public class FinalMain {

	public static void main(String[] args) {
		
		List<Course> courseList = new ArrayList<Course>();
		Course course = new Course();
		course.setCourseCode("CSC-2508");
		course.setCourseName("Advanced Java");
		
		Course course2 = new Course();
		course2.setCourseCode("CSC-0008");
		course2.setCourseName("DBMS");
		
		List<Address> addressList = new ArrayList<Address>();
		Address address = new Address();
		address.setCity("Kathmandu");
		address.setDistrictName("Kathmandu");
		address.setWardName("Kapan");
		address.setWardNo(3);
		
		Address address2 = new Address();
		address2.setCity("Kathmandu");
		address2.setDistrictName("Kathmandu");
		address2.setWardName("Chabahil");
		address2.setWardNo(6);
		
		Student student = new Student();
		student.setSid(1);
		student.setAddress(addressList);
		
		
		
		System.out.println("Student Details: ");
		System.out.println("Id: "+student.getSid());
		System.out.println("Name: "+student.getFullName());
		System.out.println("Address: ");
			for(Address addr : addressList) {
				System.out.println("City: "+addr.getCity());
				System.out.println("District Name: "+addr.getDistrictName());
				System.out.println("Ward Name: "+addr.getWardName());
				System.out.println("Ward No: "+addr.getWardNo());
			}
		
			System.out.println("Courses: ");
			for(Course course1 : courseList) {
				System.out.println("Course Name: "+course1.getCourseName());
				System.out.println("Course Code: "+course1.getCourseCode());
			}
	}
		
		
	}

