/*
Instance Initializer Block: used to initialize the instance data member. it run each time when object of the class is created.
*/

class Bike {
	int speed;
	/*
	//Instance Initializer Block
	{
		speed = 140;
		System.out.println("IIB Invoked: Speed of the bike is " + speed);
	}
	*/
	
	public Bike() {
		System.out.println("Bike Constructor");	
	}
}

class Apache extends Bike {
	{
		System.out.println("IIB Invoked: Apache");
	}
	public Apache() {
		super();
		System.out.println("Apache Constructor");	
	}
}

class IIB {
	public static void main(String[] args) {
		//Bike b = new Bike();
		Apache a = new Apache();
	}
}