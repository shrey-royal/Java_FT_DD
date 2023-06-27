class GrandFather{
	protected String property;
	
	public GrandFather(){
		property = "100 Acre";
	}
}

class Father extends GrandFather {
	protected String money;
	
	public Father(){
		money = "Blind Money";
	}
	
	public void getProperty(){
		System.out.println("GrandFather's Property: " + super.property);
	}
}

class Child extends Father {
	protected String problems;
	
	public Child(){
		problems = "LIFE, Schools, Dreams, Laptop, etc.";
	}
	
	public void getAll(){
		super.getProperty();
		System.out.println("Father's Money: " + super.money + "\nChild's Problems: " + problems);
	}
}

class Multilevel{
	public static void main(String[] args) {
		Child c = new Child();
		
		c.getAll();
	}
}