package com.advancedjava.class18;

import java.util.List;

public class Student {
	
	private long sid;
	private String fullName;
	private List<Address> address;
	private List<Course> course;
	
	public long getSid() {
		return sid;
	}
	
	public void setSid(long sid) {
		this.sid = sid;
	}
	
	public String getFullName() {
		return fullName;
	}
	
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	public List<Address> getAddress() {
		return address;
	}
	
	public void setAddress(List<Address> address) {
		this.address = address;
	}
	
	public List<Course> getCourse() {
		return course;
	}
	
	public void setCourse(List<Course> course) {
		this.course = course;
	}
	
	
	
	public String toString() {
		
		System.out.println("Student Details: ");
		System.out.println("Id: "+sid);
		System.out.println("Name: "+fullName);
		System.out.println("Address: ");
			for(Address addr : address) {
				System.out.println("City: "+addr.getCity());
				System.out.println("District Name: "+addr.getDistrictName());
				System.out.println("Ward Name: "+addr.getWardName());
				System.out.println("Ward No: "+addr.getWardNo());
			}
		
			System.out.println("COurses: ");
			for(Course course : course) {
				System.out.println("Course Name: "+course.getCourseName());
				System.out.println("Course Code: "+course.getCourseCode());
			}
			
			return null;
	}
	
	

}
