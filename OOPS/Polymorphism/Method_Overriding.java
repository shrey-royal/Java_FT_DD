/*
Rules for method_overriding: 

1. Method must have the same name as in the parent class
2. Method must have the same parameters as in the parent class
3. There must be an IS-A relationship (Inheritance).

*/


class Vehicle {
	void run() {
		System.out.println("Vehicle is Running...");
	}
}

class Bike extends Vehicle {
	void run() {
		System.out.println("Bike runs on 2 wheels!");
	}
}

class Method_Overriding {
	public static void main(String[] args) {
		Bike b = new Bike();
		b.run();
	}
}

/*
Task: Consider a scenario where Bank is a class that provides functionality to get the rate of interest. However, the rate of interest varies according to banks. For example, SBI, ICICI and AXIS banks could provide 8%, 7%, and 9% rate of interest.

*/