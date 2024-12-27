package ajp_package;
import java.util.Scanner;
public class StrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0, temp = num, rem;
		while(temp!=0) {
			rem = temp%10;
			sum += factorial(rem);
			temp/=10;
		}
		if(sum==num)	System.out.println("Strong Number");
		else	System.out.println("Not a Strong Number");
	}
	
	static int factorial(int number) {
		if(number == 0 || number == 1)	return 1;	
		return number*factorial(number-1);
	}

}
