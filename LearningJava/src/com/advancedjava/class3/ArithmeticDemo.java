package com.advancedjava.class3;

public class ArithmeticDemo {

	
		public static void main(String[] args) {
			int a = 5;
			int b = 10;
			int c = a+b;
			int d= a-b;
			int e = a*b;
			int f = a/b;
			int g = a%b;
			
			
			System.out.println("a+b :"+c);
			System.out.println("a-b :"+d);
			System.out.println("a*b :"+e);
			System.out.println("a/b :"+f);
			System.out.println("a%b :"+g);
			
			//type cast  -- higher level bata lower level ma number rakhna lai cast garne
			
			double x = 100.1234;
			int y = (int)x;
			
			System.out.println(y);
			
			String test = String.valueOf(y);
			
			System.out.println(test);
			
		}
}
