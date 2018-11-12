package com.skilldistillery.jets;

public abstract class Jet {
	private String model;
	private double speed;
	private int range;
	private long price;
	private double mach;

	private String[] sounds = new String[] { "Sheeeeeeuuuwwww", "Woooooooooooshh", "nnnneeeeeooooww", };

	public Jet(String model, double speed, int range, long price, double mach) {
		super();
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
		this.mach = mach;
	}

	public String soundMaker() {
		int l = (int) (Math.random() * 3);
		String m = sounds[l];

		return m;

	}

	public void fly() {

	}

	@Override
	public String toString() {
		return model + "***  Speed: " + speed + "mph" + "  Range: " + range + "miles" + "  Price: $" + price
				+ "  Mach: " + mach;
	}

	public double getSpeedInMach() {
		return speed;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public double getMach() {
		return mach;
	}

	public void setMach(double mach) {
		this.mach = mach;
	}

}
