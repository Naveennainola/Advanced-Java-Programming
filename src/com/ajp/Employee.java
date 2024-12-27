package com.ajp;

public class Employee extends User{
	
	double salary;

	public Employee(int id, String name, double salary) {
		super(id, name);
		this.salary = salary;
	}
	
	void calculateAnnualSalary() {
		double ann_sal = 12*salary;
		System.out.println("The annual salary of "+name+" is "+ann_sal);
	}
}
