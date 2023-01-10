package com.hibernatedemo.client;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;

import com.hibernatedemo.model.College;
import com.hibernatedemo.serviceimpl.CollegeServiceImpl;

public class MainHibernate {
	
	public static void main(String[] args) throws IOException {
	
		
		CollegeServiceImpl collegeImplOjb = new CollegeServiceImpl();
		
	College college = new College();
	college.setCollegeName("Manoj International College");
	college.setCollegeAddress(" Baneshwor");
	college.setCollegeEmail("hahaha@gmail.com");
	college.setCollegePhoneNo("233245678");
	college.setCollegeEstDate(new Date());
	
	String filePath = "C:\\Users\\Hp\\Desktop\\Temp\\profile.jpg";
	Path path = Paths.get(filePath);
	byte[] byteImageFile =  Files.readAllBytes(path);
	college.setCollegeLogo(byteImageFile);
	
	int addFlag = collegeImplOjb.addCollege(college);
	if(addFlag>=1) {
		System.out.println("Data Saved !!");
	}
	
	else {
		System.out.println("Date not saved !!");
	}
	
	
}

}
