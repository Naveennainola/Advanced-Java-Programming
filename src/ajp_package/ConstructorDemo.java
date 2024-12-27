package ajp_package;

public class ConstructorDemo {
		
	public static void main(String args[])
	{
		Student s1 = new Student();
		Student s2 = new Student(21, "ManiKumar");
	}

}

class Student{
	int sid;
	String name;
	
	public Student(){
		System.out.println("Student object created");
	}
	
	Student(int sid, String name){
		this.sid = sid;
		this.name = name;
		System.out.println("ID is:"+this.sid+", Name is:"+this.name);
	}
}
