package ajp_package;

public class SBI extends RBI{
	String manager_name;
	String branch;
	
	SBI(){
		super();
		System.out.println("This is sbi constructor");
	}
	

	public SBI(int bankcode, String name, String type, String manager_name, String branch) {
		
		super(bankcode, name, type);
		this.manager_name = manager_name;
		this.branch = branch;
		System.out.println("Manager:"+this.manager_name+" branch:"+this.branch);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBI mspt = new SBI(500018, "sbi", "reading", "reserve", "Moosapet");

}
	
}
