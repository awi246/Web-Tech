package com.advancedjava.class16;

public class OverLoadingVehicle {

		public static void main(String[] args) {
			Honda honda = new Honda();
			honda.setModel(200);
			honda.setvName("Mero Gadhi");
			honda.setvIn(000);
			honda.setYear(1854);
			
			honda.displayVehicleInfo();
			honda.displayVehicleInfo("Honda");
			
			GM gm = new GM();
			gm.displayVehicleInfo('g');
		}
}
