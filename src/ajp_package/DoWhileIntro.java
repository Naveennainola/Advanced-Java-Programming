package ajp_package;
import java.util.Scanner;

public class DoWhileIntro {
	static int evenSum(int range) {
		int num = 0, sum = 0;
		do {
			sum += num;
			num += 2;
		}while(num<=range); // exit controlled loop
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Sum is: "+evenSum(sc.nextInt()));
	}

}
