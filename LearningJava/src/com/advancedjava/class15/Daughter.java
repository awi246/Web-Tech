package com.advancedjava.class15;

import java.util.Scanner;

public class Daughter extends Father {
			String name,educationalLevel,gender;
			
			public void getDaughterDetails() {
				Scanner scanner = new Scanner(System.in);
				System.out.println("Enter Daughter Name: ");
				name= scanner.nextLine();
				System.out.println("Enter educational Level: ");
				educationalLevel = scanner.next();
				System.out.println("Enter gender: ");
				gender = scanner.next();
				
		}
			
			public void showDaughterDetails() {
					super.showFatherDetails();
					System.out.println("Daughter Details:");
					System.out.println("Name: "+name+super.name);
					System.out.println("");
					
					
			}

}
