package com.advancedjava.class11;

public class ConstructorType {
	
			int id;
			String name;
			String faculty;
			int semester;
	
			
	public ConstructorType(int id, String name, String faculty, int semester) {
			
		this.id = id;
		this.name = name;
		this.faculty = faculty;
		this.semester = semester;
	}
	
		public ConstructorType() {
				this(1,"Manoj","CSIT",4);
				System.out.println("Id: "+id,+"name: "+name,+"faculty: "+faculty,"semester: "+semester);
		}
		
		public  void display() {
			System.out.println();
		}
	
		public static void main(String[] args) {
			
			ConstructorType info = new ConstructorType();
			info.display();
			
		}

}
