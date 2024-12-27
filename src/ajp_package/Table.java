package ajp_package;

import java.util.Scanner;

public class Table {
	static void print_table(int number) {
		int i=1;
		while(i<=10) { //while loop is also called as "Entry Control Loop"
			System.out.println(number+"*"+i+"="+number*i);
			i++;
		}
	}
	public static void main(String args[])
	{
		int number;
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		print_table(number);
	}
}
