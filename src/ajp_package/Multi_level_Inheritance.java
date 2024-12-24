package ajp_package;

public class Multi_level_Inheritance extends B {
	
	public Multi_level_Inheritance() {
		// TODO Auto-generated constructor stub
		System.out.println("This is C class");
	}
	
	void whatsApp() {
		System.out.println("Whatsapping");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multi_level_Inheritance c = new Multi_level_Inheritance();
		c.call();
		c.msg();
		c.whatsApp();
	}

}

class A{
	A(){
		System.out.println("A class constructor");
	}
	
	void call() {
		System.out.println("Calling");
	}
}

class B extends A{
	public B() {
		// TODO Auto-generated constructor stub
		System.out.println("B class constructor");
	}
	
	void msg() {
		System.out.println("Messaging");
	}
}
