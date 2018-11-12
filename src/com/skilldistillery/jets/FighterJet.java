package com.skilldistillery.jets;

public class FighterJet extends Jet implements Dogfight, CombatReady{

	public void combatready1() {
		System.out.println(this.getModel() + " is ready for combat");
	}

	public FighterJet(String model, double speed, int range, long price, double mach) {
		super(model, speed, range, price, mach);
	}

	@Override
	public void dogfight() {
		System.out.println( "Your " + this.getModel() + " is now in a dogfight.");
		
		// TODO Auto-generated method stub
		
	}


}
