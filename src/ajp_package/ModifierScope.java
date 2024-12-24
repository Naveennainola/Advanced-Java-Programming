package ajp_demo_package;
import ajp_demo_package.Car;
public class ModifierScope{
	public static void main(String args[]){
		Car c = new Car();
		c.speed = 60;
		c.capacity = 90;
		c.name = "Toyota";
		//c.mileage = 15;   this is invalid since this "mileage" is a protected variable
		
		c.setMileage(20);
	
		System.out.println("Car details:" + c.speed + ","+ c.capacity + "," + c.name + "," + c.getMileage());
		
	}
}
	