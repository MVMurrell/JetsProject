package com.skilldistillery.jets;

public class CommercialJet extends Jet implements EmergencyChampagneStop{
	

	public CommercialJet(String model, double speed, int range, long price, double mach) {
		super(model, speed, range, price, mach);
	}
	public void champagnestop() {
		System.out.println(" Your " + this.getModel() + " is making an emergency landing for champagne just in time!!");
	}
	

}
	


