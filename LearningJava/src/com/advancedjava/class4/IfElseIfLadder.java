package com.advancedjava.class4;

import java.util.Scanner;

public class IfElseIfLadder {
	
		public static void main(String[] args) {
			Scanner marks = new Scanner(System.in);
			System.out.println("Enter marks: ");
			int a =  marks.nextInt();
			
			if(a >=80) {
				System.out.println("You got A");
			}
			else if(a >=60&& a<80) {
				System.out.println("You got B");
			}
			else if(a >=45 && a<60) {
				System.out.println("You got C");
			}
			else if(a >=25 && a<45) {
				System.out.println("You got D");
			}
			else {
				System.out.println("You got F");
			}
		}

}
