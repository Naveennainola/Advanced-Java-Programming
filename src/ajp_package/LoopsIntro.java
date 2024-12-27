package ajp_package;

import java.util.Scanner;
public class LoopsIntro{

	static int sum(int limit){
		int sum=0;
		while(limit>0){
			sum += limit;limit--;
		}
		return sum;
	}
	
	static void fibonacci(int limit){
		int num1=0, num2=1, num3;
		System.out.print(num1);
		while(limit>0)
		{
			num3 = num1+num2;
			num2 = num1;
			num1 = num3;
			System.out.print(" "+num3);
			limit--;
		}
	}	
		
	public static void main(String[] args){
		int limit;
		Scanner sc = new Scanner(System.in);
		limit = sc.nextInt();
		System.out.println("The fibonacci series ");
		fibonacci(limit);
	}
}