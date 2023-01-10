package com.advancedjava.class17;

public class TightCoupleDemo2 {
	
		public static void main(String[] args) {
				Area area = new Area();
				double result1 = area.triangle(6, 9);
				System.out.println("Area of triangle:"+result1);
				
				ShapesArea2 area2 = new ShapesArea2();
				int result2 = area.rectangle(4, 8);
				System.out.println("Area of rectangle:"+result2);
				
		}

}
