package com.advancedjava.class5;

import java.util.Scanner;

public class LoopUse {
 public static void main(String[] args) {
	 	Scanner input = new Scanner(System.in);
		System.out.println("Enter any number:");
		int a =  input.nextInt();
		int reverse = 0,last_digit;
		
		
		while(a!=0) {
			last_digit = a%10;
			reverse = reverse * 10 + last_digit;
			a= a/10;
			
		
		}
		
			while(reverse!=0){
				last_digit = reverse%10;
				reverse= reverse/10;
	
		 
		 switch(last_digit) {
		 case 0:
			 System.out.print("Zero ");
			 break;
		 
		 case 1:
			 System.out.print("One ");
			 break;
			 
		 case 2:
			 System.out.print("Two ");
			 break;
			
		 case 3:
			 System.out.print("Three ");
			 break;
			 
		 case 4:
			 System.out.print("Four ");
			 break;
			 
		 case 5:
			 System.out.print("Five ");
			 break;
			 
		 case 6:
			 System.out.print("Six ");
			 break;
			 
		 case 7:
			 System.out.print("Seven ");
			 break;
			 
		 case 8:
			 System.out.print("Eight ");
			 break;
			 
		 case 9:
			 System.out.print("Nine ");
			 break;
		 }
		 
			}
			reverse = reverse/10;
	}
}

