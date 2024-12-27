package com.ajp;
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a Number:");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		if(year%400 == 0)
			System.out.println(year + " is a Leap Year");
		else
			if(year%4 == 0 && year%100 != 0)
				System.out.println(year + " is a Leap Year");
			else
				System.out.println(year + " is not a Leap Year");
	}

}
