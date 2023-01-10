package com.advancedjava.class9;

public class StringBufferandBuilderDemo {
	
			public static void main(String[] args) {
				
				
				long startTime = System.currentTimeMillis();
				StringBuffer buffer = new StringBuffer("Texas");
				for(int i=0; i<1000; i++) {
					buffer.append(" International");
					buffer.append(" College");
					
				}
				
				System.out.println("Time taken by above code buffer:"+ (System.currentTimeMillis()-startTime) +" ms");
				
				long startTime1 = System.currentTimeMillis();
				StringBuilder builder = new StringBuilder("Texas");
				for(int i=0; i<1000; i++) {
					builder.append(" International");
					builder.append(" College");
					
				}
				System.out.println("Time taken by above code builder :"+ (System.currentTimeMillis() - startTime1)+" ms");
				
				
//				StringBuffer buffer = new StringBuffer("Texas");
//				buffer.append(" International ");
//				buffer.append(" College");
//				System.out.println("From Buffer:"+buffer);
//				
//				
//				StringBuilder builder = new StringBuilder("Texas");
//				buffer.append(" International ");
//				buffer.append(" College");
//				System.out.println("From Builder:"+builder);
				
		
			}

}
