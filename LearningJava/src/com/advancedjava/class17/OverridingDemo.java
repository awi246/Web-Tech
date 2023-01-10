package com.advancedjava.class17;

public class OverridingDemo {
	
	public static void main(String[] args) {
			Person person = new Person();
			
			person.setAddress("Bhaktapur");
			person.setName("Hari Bahadur");
			person.setGender("Male");
			person.getInfo(21);
			
			Teacher teacher = new Teacher();
			teacher.getInfo(32);
	}

}
