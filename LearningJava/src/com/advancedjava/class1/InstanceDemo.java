package com.advancedjava.class1;

public class InstanceDemo {
	
		private int a ;
		
		public InstanceDemo(int a ) {
				this.a = a;
				
				System.out.println("Value of a using Instance: "+ a);
		}
		
		public static void main(String[] args) {
					InstanceDemo demo = new InstanceDemo(100);
		}

}


		