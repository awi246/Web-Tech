package com.advancedjava.class9;

public class Student {
		

			
		private int rollNo;
		private String firstName;
		private String lastName;
		
		public Student(int rollNo, String firstName, String lastName) {
				this.rollNo = rollNo;
				this.firstName = firstName;
				this.lastName = lastName;
		}
		
		public String toString() {
				return "Roll No:"+rollNo+" "+"FirstName:" +firstName+" "+"LastName:"+lastName;
		}
		
			public static void main(String[] args) {
					
				Student student = new Student(1, "Manoj", "Khatri");
				System.out.println(student);
			}
		
			

}
