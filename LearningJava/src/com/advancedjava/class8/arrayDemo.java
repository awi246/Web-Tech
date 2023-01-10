package com.advancedjava.class8;

import java.util.Arrays;

public class arrayDemo {
	
	public static void main(String[] args) {
		int[] data = {10,2,43,5,100};
		
		int[] secondArray = new int[data.length];
		
		for( int i=0; i<data.length;i++) {
				secondArray[i] = data[i];
				
		}
		
		int size = data.length;
		System.out.println("Size:"+size);
		
	//	Arrays.sort(data);
		
		for(int data2 :secondArray ) {
			System.out.println(data2);
		//	System.out.println(data2);
			
		}
		
		//System.out.println("Second highest element:"+ data[data.length-2]);		
	}
	
}
