package com.adavancedjava.class10;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	
		private int empId;
		private String employeeName;
		private String employeeAddress;
		
		
		public Employee ( int empId, String employeeName, String employeeAddress) {
				this.empId = empId;
				this.employeeName = employeeName;
				this.employeeAddress = employeeAddress;
				
		}
		public static void main(String[] args) {
				
			List<Employee> empList = new ArrayList<Employee>();
			empList.add(new Employee(1,"Ram","Kathmandu"));
			empList.add(new Employee(2,"Shyam","Banepa"));
			
			
			for(int i =0; i<empList.size();i++) {
				System.out.println(empList.get(i).empId+". "+empList.get(i).employeeName+","+empList.get(i).employeeAddress);
				
				
			}
		
		}
			
	
}
