package ajp_demo_package;
import java.util.Scanner;

public class SwitchCase{
	
	public static void main(String[] args){
		
		int num;
		System.out.println("Enter a number between 0-6");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		System.out.println("Enter a character:");
		char chr;
		chr = sc.next(getChar);
		switch(num){
		
			case 0:
				System.out.println("Choosen value=0");
				break;
			case 1:
				System.out.println("Choosen value=1");
				break;
			case 2:
				System.out.println("Choosen value=2");
				break;
			case 3:
				System.out.println("Choosen value=3");
				break;
			case 4:
				System.out.println("Choosen value=4");
				break;		
			case 5:
				System.out.println("Choosen value=5");
				break;
			case 6:
				System.out.println("Choosen value=6");
				break;
			default:
				System.out.println("Invalid number");
				break;
		}
	}
}
