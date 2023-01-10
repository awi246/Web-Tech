package com.advancedjava.class9;

public class StringManipulationPart2 {
	
			public static void main(String[] args) {
				String data = "Texas College";
				String data1 = "Texas College";
				String data2 =data1.toUpperCase();

				//CopyValueof Example
				
				char[] set = { 'a', 'b', 'c', 'd', 'e', 'f'};
				
				
				String str = String.copyValueOf(set,2,4);
				
				
				System.out.println(str);
				
			
				
				//EndsWithExample
				
				if(data.endsWith("s")) {
					System.out.println("It ends with s");
				}
				else {
					System.out.println("It doesn't end with s");
				}
				
				//System.out.println(data.endsWith("s"));
				//System.out.println(data.endsWith("e"));
		
				
				
				//EqualsExample
				
				if(data.equals(data1)) {
					System.out.println("Both have same content");
				}
				else {
					System.out.println("Different Content");
				}
				
				
				//EqualIgnoreCase
				
				
				if(data.equalsIgnoreCase(data2)) {
					System.out.println("Milyo");
				}
				else {
					System.out.println("Milena");
				}
				
				
				//Format
				
				String name = String.format("%s", "Manoj Khatri");
				System.out.println(name);
				
		
			}

}
