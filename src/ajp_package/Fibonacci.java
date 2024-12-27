package ajp_package;
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		int num1 = 0, num2 = 1, num3, range;
		range = sc.nextInt();
		System.out.print(num1+" "+num2+" ");
		for(int i=0;i<range-2;i++) {
			num3 = num1 + num2;
			System.out.print(num3 + " ");
			num1 = num2;
			num2 = num3;
		}
	}

}
