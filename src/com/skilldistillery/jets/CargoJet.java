package com.skilldistillery.jets;

public class CargoJet extends Jet implements LoadCargo {
	
	
	@Override
	public void loadcargo() { 
		System.out.println( this.getModel() + " is loading it's cargo.");
		System.out.println("Cargo Loaded.");
		
	}
	

	public CargoJet(String model, double speed, int range, long price, double mach) {
		super(model, speed, range, price, mach);
		
	}



	
}
