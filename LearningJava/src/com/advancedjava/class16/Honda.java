package com.advancedjava.class16;

public class Honda extends Vehicle{
		
		
			public void displayVehicleInfo(String vName) {
				System.out.println("Name:"+vName);
				
				super.setModel(230);
				super.setvIn(04);
				super.setYear(2022);
				
				System.out.println("Vehicle Id:"+super.getvIn());
				System.out.println("Model:"+super.getModel());
				System.out.println("Year:"+super.getYear());
			}

}
