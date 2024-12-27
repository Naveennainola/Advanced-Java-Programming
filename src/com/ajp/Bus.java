package com.ajp;

public class Bus extends Vehicle{
	String type;
	String fuel;
	public Bus(int speed, String name, int mileage, String type, String fuel) {
		super(speed, name, mileage);
		this.type = type;
		this.fuel = fuel;
	}
	
	void busType() {
		System.out.println("Bus Type:"+type);
	}

}
