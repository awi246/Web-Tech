package com.advancedjava.class13;


public class Son extends Father {
	
	
	private String firstName;
	private int sonExpense;
	private int totalFamilyAmount;
	
	public void getSonDetails() {
			System.out.println("Enter son firstName: ");
			firstName = scanner.nextLine();
			scanner.nextLine();
			System.out.println("Enter your expense: ");
			sonExpense = scanner.nextInt();
	}


	public void showfamilyDetails() {
		super.showfamilyDetails();
		System.out.println("Total Family Amount:"+super.totalFamilyAmount);
		
		System.out.println("Son Details:");
		System.out.println("Name: "+firstName+ " "+ super.familyName);
		System.out.println("Address: "+ super.address);
		System.out.println("Gender: "+ super.gender);
		
		System.out.println("Son Expense: "+sonExpense);
		int totalRemainingAmount = super.totalFamilyAmount - sonExpense;
		
		
		System.out.println("Total Final Family Amount: "+totalRemainingAmount);
	}

}
