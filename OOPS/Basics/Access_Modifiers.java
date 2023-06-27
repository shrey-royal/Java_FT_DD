/*
Access Modifiers are used to specify access to the class members and methods.

Default - Package Level
Private - Class Level
Protected - Class and Inherited Classes
Public - Accessible to all

*/

class A {
	private int data = 40;
	//private A(){}	//private constructor
	protected void msg() { System.out.println("Hello Java\n" + data); }
}

class B extends A {
	B(){
		msg();
	}
}

public class Access_Modifiers {
	public static void main(String[] args) {
		B obj = new B();
		
		//System.out.println(obj.data);
		//obj.msg();
	}
}

/*
Error:

Access_Modifiers.java:19: error: A() has private access in A
                A obj = new A();
                        ^
Access_Modifiers.java:20: error: data has private access in A
                System.out.println(obj.data);
                                      ^
Access_Modifiers.java:21: error: msg() has private access in A
                obj.msg();
				   ^


Advantages of the `private` keyword in Java:

1. Encapsulation: The `private` keyword allows you to hide the internal implementation details of a class or object, ensuring encapsulation. It restricts direct access to the member variables and methods from outside the class, preventing unauthorized modification or access.

2. Information hiding: By making members `private`, you can control the visibility of variables and methods. This helps in maintaining the integrity of the data and prevents other classes or objects from modifying the internal state directly.

3. Enhanced code maintainability: Using the `private` keyword promotes better code organization and modularity. It enables you to define a clear interface for interacting with the class, reducing dependencies and making it easier to modify the implementation without affecting other parts of the codebase.

4. Improved security: `private` members ensure that sensitive information and critical operations are restricted to authorized entities only. This helps in enforcing security measures and prevents malicious or accidental misuse of the class or object.

5. Facilitates code reusability: By encapsulating the internal details of a class, you can create reusable components. Other classes or objects can interact with the public interface provided by the class without worrying about the underlying implementation, promoting code reuse and modular development.

Disadvantages of the `private` keyword in Java:

1. Limited accessibility: Making members `private` restricts their visibility to the defining class only. This can sometimes limit the flexibility of extending or using the class, especially when you want to access or modify specific aspects of the implementation from other classes or objects.

2. Increased code complexity: When multiple classes interact with each other, the use of `private` members can introduce additional complexity. You may need to rely on getters, setters, or other public methods to indirectly access or modify `private` variables, which can lead to more code and potential performance overhead.

3. Testing challenges: Since `private` members are not directly accessible from outside the class, unit testing can become more difficult. Test cases may need to rely on reflection or other techniques to access and verify the behavior of `private` members, making the testing process more complex.

4. Inflexibility in inheritance: When a member is marked as `private`, it cannot be inherited or accessed by derived classes. This can limit the ability to extend the functionality of a class and enforce certain design patterns or behaviors.

5. Increased coupling: Overuse of `private` members can lead to increased coupling between classes. Tight coupling makes the codebase less maintainable and harder to refactor, as changes in one class may have cascading effects on multiple other classes that depend on the `private` members.

It's important to note that the use of `private` is crucial for encapsulation and information hiding, but it should be balanced with other access modifiers (`public`, `protected`, and default) based on the specific requirements of the design and functionality.



*/