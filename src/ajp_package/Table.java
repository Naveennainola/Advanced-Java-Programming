package ajp_package;
import java.util.Scanner;

public class Table {
	static void print_table(int number) {
		int i=1;
		while(i<=10) {
			System.out.println(number+" * "+i+" = "+number*i);
			i++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		System.out.print("Enter a number:");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		print_table(number);		
	}

}
