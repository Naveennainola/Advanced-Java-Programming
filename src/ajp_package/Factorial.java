package ajp_package;
import java.util.Scanner;

public class Factorial {
	
	static void factorial(int number) {
		int value=1, dup = number;
		
		if(number>1) 
			while(number>0) {
				value *= number;
				number--;
			}
		System.out.println("The factorial of "+dup+" is "+value);	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		factorial(number);

	}

}
