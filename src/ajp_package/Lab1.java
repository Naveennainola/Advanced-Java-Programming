package ajp_package;
import java.util.Scanner;

public class Lab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		System.out.println("Enter 2 numbers");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		int maxNum = (num1>num2)?num1:num2;
		
		System.out.println(maxNum + " is the maximum number");
		
		System.out.println("\nBefore Swapping:");
		System.out.println("num1 is:"+num1+" num2 is:"+num2);
		num1 = num1+num2;
		num2 = num1-num2;
		num1 = num1-num2;
		System.out.println("\nAfter swapping:\nnum1 is:"+num1+" num2 is:"+num2);
	}

}
