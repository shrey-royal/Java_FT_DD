/*
Abstraction is a process of hiding the implementation details and showing only functionality to the user.

Notes:

> Abstract keyword is used to declare abstract class
> An Abstract class can have non-abstract methods
> it cannot be instantiated.
> it can have constructors and static methods also
> it can have final methods which will force the subclass not to change the body of the methods.

class obj;	//declaration of object
obj = new class();	//instantiation of the object

*/

abstract class Shape extends Parent {
	protected int i = 67;
	abstract void draw();	//declaration of method
	void color() {
		System.out.println("Coloring Shape");
	}
}

class Rectangle extends Shape {
	@Override
	void draw() {
		super.i = 56;
		System.out.println("Drawing Rectangle...");
	}
}

class Circle extends Shape {
	@Override
	void draw() {
		System.out.println("Drawing Circle...");
	}
}

public class Abstract_Class {
	public static void main(String[] args) {
		Shape rectangle, circle;
		
		rectangle = new Rectangle();
		rectangle.draw();
		rectangle.color();
		
		circle = new Circle();
		circle.draw();
	}
}