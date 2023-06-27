class A {
	protected int a;
		
	public A() {
		a = 67;
	}
	
	public void get_A() {
		System.out.println("A: " + a);
	}
}

class B extends A {
	protected int b;
		
	public B() {
		b = 10;
	}
	
	public void get_B() {
		System.out.println("B: " + b);
	}
}

class C extends A {
	protected int c;
	
	public C() {
		c = 89;
	}
	
	public void get_C() {
		get_A();
		System.out.println("C: " + c);
	}
}

class D extends B {
	protected int d;
	
	public D() {
		d = 6;
	}
	
	public void get_D() {
		//System.out.println("A: " + a);
		get_A();
		//System.out.println("B: " + b);
		get_B();
		System.out.println("D: " + d);
	}
}


class Hybrid {
	public static void main(String[] args) {
		C c = new C();
		c.get_C();
		
		D d = new D();
		d.get_D();
	}
}