/*
Super Keyword is used to call parent class method from the child class

super keyword is used to call methods, constructors, data members;

*/

class Factory {
	protected String owner;
	protected String turnOver;
	
	public Factory() {
		owner = "Shrey K";
		turnOver = "2 Crores";
		//System.out.println("This is a Default Constructor of Factory");
	}
	
	public void display() {
		System.out.println("Owner: " + owner + "\nturnOver: " + turnOver);
	}
	
}

class Goon extends Factory {
	private String name;
	
	public Goon() {
		//super();		//super constructor to call the same constructor of parent class
		name = "Dhruv";
		super.owner = name;
	}	
	
	public Goon(boolean a) {
		super();
	}
	
	
	public void displayData() {
		super.display();
	}
}


class Super_KW {
	public static void main(String[] args) {
		//Factory f = new Factory();
		Goon g = new Goon(true);
		
		g.displayData();
	}
}