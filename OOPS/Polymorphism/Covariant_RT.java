/*
Covariant Return Type in java allow a subclass method to have a return type that is a subtype of the return type of the corresponding class method in superclass.It means that a method in a subclass can override a method in the superclass and return a more specific type than the superclass.

*/

class Vehicle {
	public String getManufacturer() {
			return "Generic Manufacturer";
	}
}

class Car extends Vehicle {
	@Override	//override annotation will override the method
	public String getManufacturer() {
		return "Car Manufacturer";
	}
}

class Bike extends Vehicle {
	@Override	//override annotation will override the method
	public String getManufacturer() {
		return "Bike Manufacturer";
	}
}

public class Covariant_RT {
	public static void main(String[] args) {
		Vehicle car = new Car();
		System.out.println(car.getManufacturer());
		
		Vehicle bike = new Bike();      
		System.out.println(bike.getManufacturer());
		
		Vehicle vehicle = new Vehicle();
		System.out.println(vehicle.getManufacturer());
	}
}