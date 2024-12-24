package ajp_package;

import java.util.Scanner;

public class RealWorldExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int option, total_balance=0, value=1;
		while(true) {
			System.out.println("WELCOME TO MANI KUMAR ATM");
			System.out.println("1.Withdraw\t2.Deposit\t3.CheckBalance\t4.Exit");
			System.out.print("Select an option:");
			option = sc.nextInt();
			switch(option) {
			
			case 1:
				System.out.print("Enter the amount to withdraw:");
				int amount = sc.nextInt();
				if(amount>total_balance) {
					System.out.println("Insufficient amount\n\n");break; }
				else {
					total_balance -= amount;
				}
				break;
			
			case 2:
				System.out.print("Enter the amount to deposit:");
				int amt = sc.nextInt();
				total_balance += amt;
				System.out.println(amt+" deposited into your account\n\n");
				break;
			
			case 3:
				System.out.println("Your total balance is "+total_balance);
				break;
			
			case 4:
				value = 0;
				break;
			
			default:
				System.out.println("Invalid number entered!!!\n\n");
				break;
			}
			if(value==0)
				break;
		}

	}



}
