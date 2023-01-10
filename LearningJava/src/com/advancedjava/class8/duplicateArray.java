package com.advancedjava.class8;

import java.util.Arrays;

public class duplicateArray {

	
	public static void main(String[] args) {
			 int[] firstArray = {1,3,5,6,1,4,4,4,40};
			 int[] secondNewArray = new int[firstArray.length];
			 
			 Arrays.sort(firstArray);
			 
			 int countFlag = 0;
			 
			 for( int i =0; i<firstArray.length-1; i++) {
				 		if(firstArray[i]!= firstArray[i+1]) {
							secondNewArray[countFlag]= firstArray[i];
				 			countFlag++;
				 		}
			 }
			 
			 int lastElement = firstArray[firstArray.length-1];
			 
			 System.out.println("counter flag:"+ countFlag);
			 int last_counter = countFlag +1;
			 secondNewArray[last_counter]= lastElement;
			 
	}
}
