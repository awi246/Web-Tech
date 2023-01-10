package com.advancedjava.class9;

public class StringDemo {
	
			public static void main(String[] args) {
				char[] data = {'a', 'b', 'c'};
				
				String resultData = new String(data);
				
				System.out.println("Result Data is:"+ resultData);
				
				String data1 = "abc";
				
				System.out.println("Before Final:"+data1);
				
				String result2 = data1.concat("defg");
				System.out.println("Final: "+result2);  // string is immutable
				}
			}


