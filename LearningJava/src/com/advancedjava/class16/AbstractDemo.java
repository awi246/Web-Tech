package com.advancedjava.class16;

public class AbstractDemo extends ShapeArea{

	@Override
	public void areaTriangle(int b, int h) {
		double area = (double)(0.5*b*h);
		
		System.out.println("Area of triangle :"+area);
	}

	@Override
	public double areaCircle(int r) {
		
		return 0;
	}
	
	public static void main(String[] args) {
		AbstractDemo abstractDemo = new AbstractDemo();
		abstractDemo.areaTriangle(10,5);
		abstractDemo.areaCircle(5);
		
	}
	
	

}
