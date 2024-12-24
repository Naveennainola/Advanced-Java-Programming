package ajp_package;

public class RBI {
	int bankcode;
	String name;
	String type;
	
	RBI(){
		System.out.println("this is RBI constructor");
	}
	
	
	public RBI(int bankcode, String name, String type){
		super();
		this.bankcode = bankcode;
		this.name = name;
		this.type = type;
		System.out.println("Bank code:"+this.bankcode+" name:"+this.name+" type:"+this.type);
	}
}
