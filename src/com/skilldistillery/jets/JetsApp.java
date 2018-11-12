package com.skilldistillery.jets;

import java.util.Scanner;

public class JetsApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		AirField denver = new AirField();

		System.out.println("***Welcome to Your Airfield!!***");
		do {
			
			System.out.println("\n\n\nHow Would You Like to Proceed?");
			System.out.println("1) List Fleet");
			System.out.println("2) Fly all my Jets!");
			System.out.println("3) View My Fastest Jet");
			System.out.println("4) View My Jet With The Longest Range");
			System.out.println("5) Activies");
			System.out.println("6) Add a Jet to the Fleet");
			System.out.println("7) I gotta dip, my yacht is waiting on me.");
			int choice = input.nextInt();

			switch (choice) {
			case 1:
				denver.jetMenu();
				break;
			case 2:
				denver.fly();
				break;
			case 3:
				denver.fastest();
				break;
			case 4:
				denver.furthest();
				break;
			case 5:
				System.out.println("What would you like your planes to do?");
				System.out.println("1) Get Ready for Combat");
				System.out.println("2) Dogfight");
				System.out.println("3) Emergency Champagne Stop");
				System.out.println("4) Load up your cargo jets");
				System.out.println("5) Quit");
				int choice1 = input.nextInt();
				switch (choice1) {
				case 1:
					denver.combatready();
					break;
				case 2:
					denver.dogfight();
					break;
				case 3:
					denver.champagne();
					break;
				case 4:
					denver.loadingcargo();
				case 5:
					break;
				}
				break;
			case 6:
				denver.addJet();
				break;
			case 7:
				System.exit(0);
			}
			
		} while (true);

	}
	
}
