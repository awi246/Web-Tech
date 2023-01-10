package com.hibernatedemo.client;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.hibernatedemo.model.College;
import com.hibernatedemo.serviceimpl.CollegeServiceImpl;

public class MainHibernate2 {
	
	public static void main(String[] args) throws IOException {
	
		
		CollegeServiceImpl collegeImplObj = new CollegeServiceImpl();
		
//		int resultDelete = collegeImplObj.deleteCollege(2);
//		if(resultDelete>=1) {
//			System.out.println("Data Deleted Successfully");
//		}
//		
//		else {
//			System.out.println("Failed to delete");
//		}
//		
	
		College college1 = collegeImplObj.getCollege(1);
		System.out.println("Id:"+college1.getCollegeId());
		System.out.println("Name:"+college1.getCollegeName());
		System.out.println("Address:"+college1.getCollegeAddress());
	
}

}
