package com.advancedjava.class4;

import java.util.Scanner;

public class IfStatementUse {
	
	public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter any character");
			char a =s.next().charAt(0);
			
			if(a =='a' || a=='e' || a =='i' || a=='o' || a=='u'|| a=='A'|| a=='E'|| a=='I'|| a=='O'|| a=='U')
			{
				System.out.println("You have entered a vowel character: "+ a);
			}
			{
				System.out.println("Yuu have entered a consonent character: "+a);
			}
			
	}

}  
