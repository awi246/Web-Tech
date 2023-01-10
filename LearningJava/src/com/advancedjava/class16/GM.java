package com.advancedjava.class16;

public class GM extends Vehicle {
		
	public void displayVehicleInfo(char g) {
		System.out.println("Vehicle Character:"+g);
		
		super.setvName("GM");
		super.setvIn(0334);
		super.setModel(42);
		super.setYear(2008);
		
		
		System.out.println("Vehicle Id:"+super.getvIn());
		System.out.println("Model:"+super.getModel());
		System.out.println("Year:"+super.getYear());
	}
	
}
