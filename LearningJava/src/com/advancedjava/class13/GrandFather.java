package com.advancedjava.class13;

import java.util.Scanner;

public class GrandFather {
	
	protected String familyName;
	protected String address;
	protected String gender;
	private String firstName;
	
	public void getGrandFatherInformation() {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter Family name: ");
			familyName = scanner.nextLine();
			System.out.println("Enter address: ");
			address = scanner.nextLine();
			gender = "Male";
			System.out.println("Enter First name: ");
			firstName = scanner.nextLine();
	}
	
	public void showfamilyDetails() {
		
		System.out.println("Grandfather Details:");
		System.out.println("Name: "+firstName+ " "+familyName);
		System.out.println("Address: "+ address);
		System.out.println("Gender: "+ gender);
	}

}
