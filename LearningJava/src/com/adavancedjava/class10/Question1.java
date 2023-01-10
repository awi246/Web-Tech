package com.adavancedjava.class10;

public class Question1 {
	
	//counting total no. of vowels in string
		public static void main(String[] args) {
			String input = "Texas International College";
			String lowercase = input.toLowerCase();
			int count = 0;
			 
	        for (int i = 0; i < lowercase.length(); i++) {
	           
	            if (lowercase.charAt(i) == 'a' || lowercase.charAt(i) == 'e'|| lowercase.charAt(i) == 'i'|| 
	            	lowercase.charAt(i) == 'o' || lowercase.charAt(i) == 'u') {
	                
	                count++;
	            }
	        }
	        System.out.println("Total no of vowels in string are:"+count);
	        
	        
	        //Reversing the string
	        String result="";
	        
	        for (int i=input.length()-1;i>=0;i--) {
	        	char data = input.charAt(i);
	        	result = result +data;
	        }
	        System.out.println(result);
	        
	        
	        
		}
}

	   
