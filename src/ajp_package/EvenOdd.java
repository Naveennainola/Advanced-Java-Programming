package ajp_package;

public class EvenOdd{
	
	void check(int number){
		if(number%2==1)
			System.out.println(number+" is odd");
		else
			System.out.println(number+" is even");
	}
	public static void main(String args[]){
		int number = 15;
		EvenOdd evod = new EvenOdd();
		evod.check(number);
	}
}