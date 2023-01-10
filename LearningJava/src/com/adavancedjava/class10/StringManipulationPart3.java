package com.adavancedjava.class10;

public class StringManipulationPart3 {
	
			public static void main(String[] args) {
				//replace the character in a string
				
				String input = "Texas_International_College";
				String input2 = "Java Developer";
				
			//	String replace = input.replace("_"," ");
			//	System.out.println(replace);
				
				
				//split ley j ma chaiyeko xa tesaima break garxa ::  dherai place ma use hunxa yo method
				
				String[] result= input.split("_");
				
				for(String data: result) {
				System.out.println(data);
				
				}
				
				//substring
				
				String substring = input2.substring(7,12);
				System.out.println(substring);
				
				
				//trim : removes whitespaces 
				
				
				
				
			}

}
