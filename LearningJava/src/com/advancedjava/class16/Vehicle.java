package com.advancedjava.class16;

public class Vehicle {
	
			private String vName;
			private int vIn;
			private long model;
			private int year;
			
			


			public String getvName() {
				return vName;
			}


			public void setvName(String vName) {
				this.vName = vName;
			}


			public int getvIn() {
				return vIn;
			}


			public void setvIn(int vIn) {
				this.vIn = vIn;
			}


			public long getModel() {
				return model;
			}


			public void setModel(long model) {
				this.model = model;
			}


			public int getYear() {
				return year;
			}


			public void setYear(int year) {
				this.year = year;
			}
			
			public void displayVehicleInfo() {
					System.out.println("Name:"+vName);
					System.out.println("Vehicle Id:"+vIn);
					System.out.println("Model:"+model);
					System.out.println("Year:"+year);
					
					
			}

}
