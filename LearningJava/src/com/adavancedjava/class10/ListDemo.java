package com.adavancedjava.class10;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

		public static void main(String[] args) {
				List<String> studentName = new ArrayList<String>();
				
				studentName.add("Manoj");
				studentName.add("Milan");
				studentName.add("Meena");
				
				
				for(int i =0; i<studentName.size();i++) {
				System.out.println(studentName.get(i));
				}
				
				studentName.add(0, "Manish");
				
				System.out.println("After adding element in index 0 \n");
				for(int i =0; i<studentName.size();i++) {
					System.out.println(studentName.get(i));
					}
				
				studentName.remove(2);
				
				System.out.println("After removing element in index 2 \n");
				for(int i =0; i<studentName.size();i++) {
					System.out.println(studentName.get(i));
					}
				
		}
}
