package ajp_package;
import java.util.Scanner;

public class ForIntro {
	
	static boolean isPrime(int target) {
		int num=2;
		for(;num*num<=target;num++) {
			if(target%num==0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int range = sc.nextInt();
		int count = 0;
		for(int i=2;i<=range;i++)
			if(isPrime(i)) {
				System.out.print(i+" ");
				count++;}
		System.out.println("");
		System.out.println(count);
	}

}
