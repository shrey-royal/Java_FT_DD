/*
final keyword is used as an constant in java
-> variable (class members)
-> classes
-> methods


*/



/*
//final variable
class Vehicle {
	final int speedLimit = 12;
}
*/
/*
//final method
class Vehicle {
	public final void Drive() {
		System.out.println("Driving...");
	}
}

class Car extends Vehicle {
	public void Drive() {
		System.out.println("Driving Overridden...");
	}
}
*/
/*
//Final Class
final class Vehicle {}

class Car {
	public void Drive() {
		System.out.println("Driving Overridden...");
	}
}
*/

/*
class Employee {
	static final int id;	//static blank final variable
	String name;
	final String Pan_Card_Number;	//blank final variable

	static {
		//static block
		id = 420;
	}


	public Employee(String name, String Pan_Card_Number) {
		this.name = name;
		this.Pan_Card_Number = Pan_Card_Number;
	}
}
*/

class Bike {
	int cube(final int n) {	//final parameter
		n+=2;	//error
		return n*n*n;
	}
}

public class Final_KW {
	public static void main(String[] args) {
		//Vehicle v = new Vehicle();
		//v.Drive();

		//Car c = new Car();
		//c.Drive();

		/*
		Employee e = new Employee("Dhruvbhai", "888888");

		System.out.println("e.id: " + Employee.id);
		System.out.println("e.name: " + e.name);
		System.out.println("e.Pan_Card_Number: " + e.Pan_Card_Number);
		*/

		Bike b = new Bike();
		System.out.println("b.cube(3): " + b.cube(3));
	}
}