/*
Inheritance is a way of re-using the data (attribute/methods).

1. Single Inheritance
2. Multilevel Inheritance
3. Multiple Inheritance
4. Hierarchical Inheritance
5. Hybrid Inheritance

*/

class Base {
	public void printBase(){
		System.out.println("This is PrintBase from Base");
	}
}

class Child extends Base {
	public void printChild(){
		System.out.println("This is PrintChild from Child");
	}
}

class Single {
	public static void main(String[] args) {
		Child c = new Child();
		
		c.printBase();
		c.printChild();
	}
}

/*
Animal Class : color, breed, age
		eat(), sleep()
		
Dog : use parent classes attr/methods

*/