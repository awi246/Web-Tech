package com.advancedjava.class11;

public class DemoThis {
	
		int id;
		String name;
		String address;
		double salary;
		String collegeName;
		
		
		public DemoThis(int id, String name, String address, double salary, String collegeName) {
			
			this.id = id;
			this.name = name;
			this.address = address;
			this.salary = salary;
			this.collegeName=collegeName;
			
			
			
		}
		
		public DemoThis() {
			this(1,"Manoj","Kapan",125000,"Texas");
			//System.out.println("Name from Non Para. Constructor: "+name);
		}
		
		public void address(String collegeName) {
			System.out.println(collegeName);
		}
		public void display() {
		//	this.print();
			System.out.println("Id: "+id+ "Name: "+name+ "Address: "+address);
			System.out.println("COllege Name: "+collegeName);
					
		}
		
		public void print() {
				System.out.println("Texas International College");
				System.out.println("salary:" + salary);
		}

		
		public static void main(String[] args) {
			
			DemoThis demothis = new DemoThis();
			demothis.display();
			
		}
		
		
}
