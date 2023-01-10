package com.advancedjava.class15;


	public class EncapsulationDemo2 {
				
		public static void main(String[] args) {
			 Employee employee = new Employee();
			 
			 Address address = new Address();
			 
			 address.setProvinance("Bagmati");
			 address.setWardNo(11);
			 
			 employee.setAddress(address);
			 
			 Address resultAddress = employee.getAddress();
			 String namePro = resultAddress.getProvinance();
			 System.out.println("Provinance Name: "+namePro);
			 
		}
}
