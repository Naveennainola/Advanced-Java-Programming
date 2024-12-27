package com.ajp;

public class Car extends Vehicle{
	int capacity;
	int airbags;
	
	public Car() {
		// TODO Auto-generated constructor stub
		super(100, "abc", 10)
	}
	public Car(int speed, String name, int mileage, int capacity, int airbags) {
		super(speed, name, mileage);
		this.capacity = capacity;
		this.airbags = airbags;
	}

	void carName() {
		System.out.println(name);
	}

}
