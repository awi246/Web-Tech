package com.jdbcdemo.serviceimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.jdbcdemo.dbconnect.DatabaseConnection;
import com.jdbcdemo.model.Student;
import com.jdbcdemo.service.StudentService;


public class StudentServiceImpl implements StudentService{
	private static List<Student> slist;
	
	
	
	public int addStudent(Student student) {
		int flag= 0;
		
		
try {
			
	Connection con = DatabaseConnection.getDBConnection();
	
	String sql ="Insert into student(fname,mname,lname,gender,address,phoneNo,rollno,dob) values(?,?,?,?,?,?,?,?)";
	
	PreparedStatement pstm = con.prepareStatement(sql);
	pstm.setString(1, student.getfName());
	pstm.setString(2, student.getlName());
	pstm.setString(3, student.getmName());
	pstm.setString(4, student.getGender());
	pstm.setString(5, student.getAddress());
	pstm.setString(6, student.getPhoneNo());
	pstm.setInt(7, student.getRollNo());
	pstm.setString(8, student.getDob());
	
	if(pstm.executeUpdate()>0) {
		flag=1;
	}	
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return flag;
		
		
	}


	public int updateStudent(Student student) {
		int flag= 0;
		
		try {
		Connection con = DatabaseConnection.getDBConnection();
		
		String sql ="update student set fname=?,mname=?,lname=?,gender=?,address=?,phoneNo=?,rollno=?,dob=?) where Sid=?";
		
		PreparedStatement pstm = con.prepareStatement(sql);
		pstm.setString(1, student.getfName());
		pstm.setString(2, student.getlName());
		pstm.setString(3, student.getmName());
		pstm.setString(4, student.getGender());
		pstm.setString(5, student.getAddress());
		pstm.setString(6, student.getPhoneNo());
		pstm.setInt(7, student.getRollNo());
		pstm.setString(8, student.getDob());
		
		if(pstm.executeUpdate()>0) {
			flag=1;
		}			
		
		}catch (Exception e) {
			
		}
		return flag;
		
		
	}

	@Override
	public List<Student> getStudents() {
		List<Student> slist= new ArrayList<Student>();
		try {
		Connection con=DatabaseConnection.getDBConnection();
		Statement statement =con.createStatement();
		String sql ="select * from student";
		ResultSet rs=statement.executeQuery(sql);
		while(rs.next())
		{
			Student student = new Student();
			student.setSid(rs.getInt("sid"));
			student.setfName(rs.getString("fName"));
			student.setmName(rs.getString("mName"));
			student.setlName(rs.getString("lName"));
			student.setGender(rs.getString("gender"));
			student.setAddress(rs.getString("address"));
			student.setPhoneNo(rs.getString("phoneNo"));
			student.setRollNo(rs.getInt("rollNo"));
			student.setDob(rs.getString("dob"));
			
			slist.add(student);
		}
		}catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
		return slist;
	}

	@Override
	public Student getStudent(int sid) {
		Student student = new Student();
		
		try {
			
			Connection con = DatabaseConnection.getDBConnection();
			
			String sql = "select * from student where sid=?";
			PreparedStatement pstm = con.prepareStatement(sql);
			pstm.setInt(1,sid);
			ResultSet rs = pstm.executeQuery();
			
			while(rs.next())
			{
				
				student.setSid(rs.getInt("sid"));
				student.setfName(rs.getString("fName"));
				student.setmName(rs.getString("mName"));
				student.setlName(rs.getString("lName"));
				student.setGender(rs.getString("gender"));
				student.setAddress(rs.getString("address"));
				student.setPhoneNo(rs.getString("phoneNo"));
				student.setRollNo(rs.getInt("rollNo"));
				student.setDob(rs.getString("dob"));
				
		
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return student;
	}

	@Override
	public String deleteStudent(int sid) {
		String flag = null;
		
		try {
			
			Connection con = DatabaseConnection.getDBConnection();
			
			String sql = "delete from student where sid=?";
			PreparedStatement pstm = con.prepareStatement(sql);
			pstm.setInt(1,sid);
			if(pstm.executeUpdate()>0) {
				flag ="Student "+sid+ " deleted succesfully";
			}
			
			else {
				System.out.println("Cannot find the sid");
			}
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return flag;
			
		
	}
	

}