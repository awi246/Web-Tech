package com.advancedjava.class16;

public class MethodOverloadingDemo {
	
			public void area(int r) {
				double area = 3.14*r*r;
				System.out.println("Area of circle :"+area);
				
			}
			
			public void area(int l , int b) {
				int area = l*b;
				System.out.println("Area of rectangle:"+area);
				
			}
			
			public void area(double r) {
				double area = 3.14*r*r;
				System.out.println("Area:"+area);
			}
			
			public static void main(String[] args) {
				MethodOverloadingDemo obj = new MethodOverloadingDemo();
				obj.area(10, 5);
				obj.area(4.5);
				obj.area(6);
			}

}
