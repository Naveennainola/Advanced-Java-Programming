package ajp_demo_package;

import java.util.Scanner;

public class Results {
	
	int sub1, sub2, sub3, sub4;
	void findResult(){
		if(sub1>=35 && sub2>=35 && sub3>=35 && sub4>=35)
		{
			int total, avg;
			char g=' ';
			total = sub1+sub2+sub3+sub4;
			avg = total/4;
			if(avg>=80)
				g='A';
			else if(avg>=70 && avg<80)
				g = 'B';
			else if(avg>=60 && avg<70)
				g = 'C';
			else if(avg>=50 && avg<60)
				g = 'D';
			else if(avg>=35 && avg<50)
				g = 'E';
			
			switch(g){
				case 'A':	System.out.println("Student got \'A\' grade");break;
				case 'B':	System.out.println("Student got \'B\' grade");break;
				case 'C':	System.out.println("Student got \'C\' grade");break;
				case 'D':	System.out.println("Student got \'D\' grade");break;
				case 'E':	System.out.println("Student got \'E\' grade");break;
			}
		}
		else
			System.out.println("Student got failed");
	}
	
	public static void main(String[] args){
		System.out.println("Enter 4 subjects marks");
		Results res = new Results();
		Scanner sc = new Scanner(System.in);
		res.sub1 = sc.nextInt();
		res.sub2 = sc.nextInt();
		res.sub3 = sc.nextInt();
		res.sub4 = sc.nextInt();
		res.findResult();
	}
}	