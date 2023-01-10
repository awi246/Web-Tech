package com.advancedjava.class15;

import java.util.Scanner;

public class Father extends GrandFather{
			
			String name,emailId,occupation;
			long phoneNumber;
			
			
			public void getFatherDetails() {
					super.getGrandFatherDetails();
					Scanner scanner = new Scanner(System.in);
					System.out.println("Enter Father's name");
					name = scanner.next();
					System.out.println("Enter emailId");
					emailId = scanner.next();
					System.out.println("Enter father's occupation");
					occupation = scanner.next();
			}
			
			public void showFatherDetails() {
				super.showGrandFatherDetails();
			}
			

}
