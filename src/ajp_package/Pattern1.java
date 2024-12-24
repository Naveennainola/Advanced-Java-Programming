package ajp_package;
import java.util.Scanner;

public class Pattern1 {
	
	static void numPattern(int number) {
		int num = 1;
		while(num<=number) {
			int temp = 1;
			while(temp<=num) {
				System.out.print(temp+" ");
				temp++;
			}
			System.out.print("\n");
			num++;
		}
	}
	
	static void starPattern(int number) {
		int i=1, j;
		while(i<=number) {
			j=1;
			while(j<=number) {
				System.out.print("* ");
				j++;
			}
			System.out.println("");
			i++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		numPattern(sc.nextInt());
		starPattern(sc.nextInt());
	}

}
