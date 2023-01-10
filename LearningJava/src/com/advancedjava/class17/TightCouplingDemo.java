package com.advancedjava.class17;

public class TightCouplingDemo {

				public static void main(String[] args) {
					Shapes shapes = new Shapes(10,7,4);
					
					int volume = shapes.volume;
					System.out.println("Volume: "+volume);
				}
				
}
