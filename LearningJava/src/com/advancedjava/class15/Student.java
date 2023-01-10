package com.advancedjava.class15;


//Encapsulation Demo
public class Student {
			
			private int rollNo;
			private String name;
			private boolean gender;
			private String emailId;
			private long phoneNo;
			
		
			
			public void setRollNo(int rollNo) {
				this.rollNo = rollNo;
				
			}
			
			public int getRollNo() {
				return rollNo;
			}
			
			public String getName() {
				return name;
			}

			public void setName(String name) {
				//modify
				String modName = name.substring(0,4);
						
				this.name = modName;
			}

			public boolean isGender() {
				return gender;
			}

			public void setGender(boolean gender) {
				this.gender = gender;
			}

			public String getEmailId() {
				return emailId;
			}

			public void setEmailId(String emailId) {
				this.emailId = emailId;
			}

			public long getPhoneNo() {
				return phoneNo;
			}

			public void setPhoneNo(long phoneNo) {
				this.phoneNo = phoneNo;
			}

			

}
