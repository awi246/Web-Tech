package com.jdbcdemo.client;

import java.util.List;

import com.jdbcdemo.model.Student;
import com.jdbcdemo.serviceimpl.StudentServiceImpl;

public class Demo {
	public static void main(String[] args) {

		
		StudentServiceImpl impl = new StudentServiceImpl();
		
		List<Student> slist = impl.getStudents();
		for(Student std : slist) {
			System.out.println("ID: "+ std.getSid());
			System.out.println("FName: "+std.getfName());
			System.out.println("MName: "+std.getmName());
			System.out.println("LName: "+std.getlName());
			System.out.println("Gender: "+std.getGender());
			System.out.println("Phone: "+std.getPhoneNo());
			System.out.println("RollNo: "+std.getRollNo());
		}
		
		
//		Student student = impl.getStudent(1);
//		System.out.println("Id : "+student.getSid());
//		System.out.println("Name : "+student.getfName());
		
//		String message = impl.deleteStudent(2);
//		System.out.println(message);
		
//		Student student2 = new Student();
//		
//
//		student2.setfName("Shyam");
//		student2.setmName("Bahadur");
//		student2.setlName("Khatri");
//		student2.setGender("Male");
//		student2.setAddress("Kapan");
//		student2.setPhoneNo("984353602");
//		student2.setRollNo(21);
//		student2.setDob("2004-05-09");
//		
//		
//		int result = impl.addStudent(student2);
//		if(result>0) {
//			System.out.println("Student inserted successfully!");
//		}
//		
Student student2 = new Student();
		

		student2.setfName("Shyameee");
		student2.setmName("Bahadur");
		student2.setlName("Khatri");
		student2.setGender("Male");
		student2.setAddress("Kapan");
		student2.setPhoneNo("984353602");
		student2.setRollNo(21);
		student2.setDob("2004-05-09");
		student2.setSid(1);
		
		int resultCount = impl.updateStudent(student2);
		
		if(resultCount>0) {
			System.out.println("Data updated Successfully");
		}
		
		else {
			System.out.println("Failed to update");
		}
		
		
		
	}

}
