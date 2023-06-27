//Multiple Inheritance

interface Interface1 {
	void method1();
}

interface Interface2 {
	void method2();
}

class MyClass implements Interface1, Interface2 {
	@Override
	public void method1() {
		System.out.println("Implementation of Method 1");
	}
	
	@Override
	public void method2() {
		System.out.println("Implementation of Method 2");
	}
}


public class Multiple_Interface {
	public static void main(String[] args) {
		MyClass myObj = new MyClass();
		
		myObj.method1();
		myObj.method2();
	}
}