package com.advancedjava.class1;

public class firstClass {
	
				firstClass () {
					System.out.println("Constructor");
					
					
				}
	
					public void localDemo() {
							int a = 1;
							a = a + 100;
							System.out.println("value of a from local: "+a);
					}
	
	
				public static void main(String[] args) {
//				System.out.println("Texas International College");
					
					firstClass demo = new firstClass();
					demo.localDemo();
				}
				
}
