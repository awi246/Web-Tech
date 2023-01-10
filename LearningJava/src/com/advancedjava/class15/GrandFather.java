package com.advancedjava.class15;

import java.util.Scanner;

public class GrandFather {
			String name,address,gender;
			long phoneNumber;
			
			public void getGrandFatherDetails() {
				
			Scanner info = new Scanner(System.in);
			System.out.println("Enter GrandFather's name:");
			name = info.next();
			System.out.println("Enter address");
			address = info.next();
			System.out.println("Enter gender");
			gender = info.next();
			}
			
			public void showGrandFatherDetails() {
					System.out.println("Grandfather's Details:");
					System.out.println("Name: "+name);
					System.out.println("Address: "+address);
					System.out.println("Gender: "+gender);
			}
			
			

}
