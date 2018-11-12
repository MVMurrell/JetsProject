package com.skilldistillery.jets;

import java.util.Scanner;

public class AirField {
	Jet[] jets = new Jet[100];
Scanner input = new Scanner(System.in);

	public AirField() {
		super();
		this.jets = popAirfield();
	}

	public Jet[] popAirfield() {

		Jet[] jetConstruct = new Jet[100];
		jetConstruct[0] = new FighterJet("F18 Fighter", 1190.00, 700, 29000000, 1.8);
		jetConstruct[1] = new FighterJet("HarrierII Jump Jet", 731.00, 2100, 29000000, 1.8);
		jetConstruct[2] = new FighterJet("SR-71 Dark Ops", 2455.26, 2500, 34000000, 3.2);
		jetConstruct[3] = new CommercialJet("Gulfstream G6 Special", 709.72, 8631, 66500000, .925);
		jetConstruct[4] = new CommercialJet("AirbusACJ Lux Edition", 527, 7862, 85000000, .686);
		jetConstruct[5] = new CargoJet("An-225 Mega Liner", 528.98, 9569, 250000000, .687);
		jetConstruct[6] = new CargoJet("C-17 Globemaster III", 590.79, 5200, 218000000, .77);
		return jetConstruct;
	}

	public void jetMenu() {
		System.out.println("****Rest Your Eyes Upon Your Fleet****");
		for (int i = 0; i < jets.length; i++) {
			if (jets[i] != null) {
				Jet tempJet = jets[i];
				System.out.println(i + 1 + ")  " + tempJet);
			}
		}
	}

	public void addJet() {

		System.out.println("I see you would like to add a jet to\n"
				+ " your fleet. Please fill out the following info...");

		System.out.print("Model Name: ");
		String model = input.nextLine();

		System.out.print("Max speed in MPH: ");
		double speed = input.nextDouble();

		System.out.print("Range(miles): ");
		int range = input.nextInt();

		System.out.print("Price: ");
		long price = input.nextLong();
		
		double mach = speed/767.269148;

		Jet newJet = new JetImpl(model, speed, range, price, mach);
		System.out.println();

		System.out.println("Your New Jet: ");
		System.out.println(newJet.toString());
		System.out.println();

		for (int i = 0; i < this.jets.length; i++) {
			if (this.jets[i] == null) {
				this.jets[i] = newJet;
				System.out.println("Your " + newJet.getModel() + " has been added to your fleet." );
				break;
			}
		}
	}


	public void fly() {
		System.out.println("****Your Fleet is Taking Off****");
		for (int i = 0; i < jets.length; i++) {
			if (jets[i] != null) {
				Jet tempJet = jets[i];
				System.out.println(tempJet.getModel() + "   " + tempJet.soundMaker());
			}
		}
	}

	public void fastest() {
		Jet fastest = jets[0];
		for (int i = 0; i < jets.length; i++) {
			while (jets[i] != null) {
				if (jets[i].getSpeed() > fastest.getSpeed()) {
					fastest = jets[i];
				} else {
					break;
				}
			}
		}
		System.out.println("Your fastest jet is the " + "\n" + fastest + " \n");
	}

	public void furthest() {
		Jet furthest = jets[0];
		for (int i = 0; i < jets.length; i++) {
			while (jets[i] != null) {
				if ((jets[i].getRange() / jets[i].getSpeed()) > (furthest.getRange() / furthest.getSpeed())) {
					furthest = jets[i];
				} else {
					break;
				}
			}
		}
		System.out.println("Your jet with the longest range is the " + "\n" + furthest + " \n");

	}

	public void loadingcargo() {
		for (int i = 0; i < jets.length; i++) {
			if (jets[i] != null) {
				if (jets[i] instanceof LoadCargo) {
				((LoadCargo)jets[i]).loadcargo();
				}
			}
		}
	}

	public void combatready() {
		for (int i = 0; i < jets.length; i++) {
			if (jets[i] != null) {
				if (jets[i] instanceof CombatReady) {
				((CombatReady)jets[i]).combatready1();
				}
			}
		}
	}

	public void champagne() {
		for (int i = 0; i < jets.length; i++) {
			if (jets[i] != null) {
				if (jets[i] instanceof EmergencyChampagneStop) {
				((CommercialJet)jets[i]).champagnestop();
				}
			}
		}
	}

	public void dogfight() {
		for (int i = 0; i < jets.length; i++) {
			if (jets[i] != null) {
				if (jets[i] instanceof FighterJet) {
				((FighterJet) jets[i]).dogfight();
				}
			}
		}
	}
}
