package com.advancedjava.class17;

public class Area implements CommonArea {
	
				public double triangle(int b, int h) {
					double area= 0.5*b*h;
					return area;
				}
				
				public int rectangle(int l , int b) {
					int area = l*b;
					return area;
				}

}
