package ajp_package;
import java.util.Scanner;

public class PalindromeNum {
	
	static void palindrome(int number) {
		int dup = number, new_val = 0, temp;
		while(dup>0) {
			temp = dup%10;
			new_val = new_val*10+temp;
			dup /= 10;
		}
		if(number == new_val)
			System.out.println("Palindrome Number");
		else
			System.out.println("Not a Palindrome Number");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		palindrome(num);
	}

}
