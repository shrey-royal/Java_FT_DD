class Car {
	// class members
	private int model;
	private String name, transmission, fuel;
	private float mileage;
	
	Car() {
		model = 2020;
		name = "Honda Civic";
		transmission = "Manual 5 gear";
		mileage = 18;
		fuel = "Petrol";
	}
	
	Car(int model, String name, String transmission, float mileage, String fuel) {
		this.model = model;
		this.name = name;
		this.transmission = transmission;
		this.mileage = mileage;
		this.fuel = fuel;
	}
	
	public void printCarDetails(){
		System.out.println("\nModel: " + model + "\nName: " + name);
		System.out.println("Transmission: " + transmission + "\nMileage: " + mileage);
		System.out.println("Fuel: " + fuel);
	}
}


public class Constructor {
	public static void main(String[] args) {
		
		Car c = new Car(1960, "Ford Mustang Classic", "Manual 6 gear", 12, "Octane Petrol");
		c.printCarDetails();
		
		Car c1 = new Car();
		c1.printCarDetails();
	}
}

/*
Constructor is a special method that executes automatically while creating an object.

It is used to initialize the instance variables/members

there are 2 types of constructors in java:
	1. Default Constructor
	2. Parameterized Constructor
	
this keyword refers the current class's instance variable

*/