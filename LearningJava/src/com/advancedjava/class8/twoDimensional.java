package com.advancedjava.class8;

public class twoDimensional {
		
	public static void main(String[] args) {
		
		int a[][]={{1,3,4},{4,5,6},{7,8,9}};    
		int b[][]={{7,8,9},{9,8,7},{9,9,9}};    
		int add[][]=new int[3][3];  
	    
		  
		for(int i=0;i<3;i++){    
			
			for(int j=0;j<3;j++){ 
				
					add[i][j]=a[i][j]+b[i][j];   
					System.out.print(" "+add[i][j]);    
								}    
			
			System.out.println(" ");
						}    
	}
}
