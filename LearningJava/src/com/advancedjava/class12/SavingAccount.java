package com.advancedjava.class12;



public class SavingAccount extends Account {
			
			int amount=0;
			int depositAmount;
			int withdrawAmount;
			double interest;
			double totalAmount;
			
	public void deposit() {
		System.out.println("Enter the amount you want to deposit: ");
		depositAmount = input.nextInt();
		amount = amount + depositAmount;
		
	}
	
	public void withdraw() {
		
		System.out.println("Enter the amount you want to withdraw: ");
		withdrawAmount= input.nextInt();
		
		if(amount>= 1000) {
			amount = amount- withdrawAmount;
		}
		else {
			System.out.println("You don't have sufficient amount to withdraw");
		}
		
		
		
			
	}
	
	public void finalAmountResult() {
			if(amount>0) {
				interest = (amount*1*5)/100;
				totalAmount= interest+amount;
			}
		
			System.out.println("Final Amount Details:");
			System.out.println("AccoutNumber: "+accountNo+ " " +"CustomerName: "+customerName+" "+ "Remaining Amount:"+ totalAmount);
			
			
	}
	
	
	public static void main(String[] args) {
				SavingAccount manoj = new SavingAccount();
				manoj.deposit();
				manoj.withdraw();
				manoj.finalAmountResult();
				
				
	}
	

}
