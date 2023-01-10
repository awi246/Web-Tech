package com.advancedjava.class17;

public class ShapesArea2  implements CommonArea{
	
			
	public double triangle(int b, int h) {
		Area area = new Area();
		return area.triangle(b, h);
	}
	
	public int rectangle(int l, int b) {
		return l*b;
	}
				
}
 