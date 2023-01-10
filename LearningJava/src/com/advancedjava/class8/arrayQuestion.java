package com.advancedjava.class8;

import java.util.Arrays;

public class arrayQuestion {
	
		public static void main(String[] args) {
			int sum = 0;
		
			int[] data = {10,2,43,5,100};
			
		//Sum	
			for( int i=0; i<data.length;i++) {
				sum = sum + data[i];
		}
			System.out.println("The sum of given numbers is:"+ sum);

		// Max and minimum	
			int size = data.length;
			
			Arrays.sort(data);
			System.out.println("Minimum Value is:"+data[0]);
			System.out.println("Minimum Value is:"+data[size-1]);
			
			
		// Odd and even
			
			for( int i=0; i<data.length;i++) {
					if(data[i]%2==0) {
						System.out.println("Even numbers:"+ data[i]);	
					}
					
					else {
						System.out.println("Odd numbers:"+ data[i]);
				}
			}
			
			
			}
}
