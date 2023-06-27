/*
Polymorphism: it is a concept of using the same code in different ways

> Overloading: Method
> Overriding: Method
> Covariant Return type
> super Keyword
> Instance Initializer block
> final keyword
> Run time Polymorphism (Upcasting/Downcasting)
> Static/Dynamic Binding
> instanceof Operator

*/

//Method Overloading

class Royal_Faculties {
	void facultyMember(int a) {
		System.out.println("Krutarth Sir is Branch Head of Royal Gandhinagar");
		System.out.println("Krutarth Sir takes C, C++, Python, Advanced Python, Django, SQL, HTML, CSS, Robotics, etc.");
	}
	
	void facultyMember(float a) {
		System.out.println("Jay Sir is a Core member of this Esteemed Institute");
		System.out.println("Jay Sir takes C, C++, Java, Advanced Java, SQL, Spring Framework, etc.");
	}
	
	void facultyMember(double a) {
		System.out.println("Jaynam Sir is also a core member of Royal.");
		System.out.println("Jaynam Sir takes UNITY Game Engine, HTML, CSS, JS, C, etc.");
	}
	
	void facultyMember(String a) {
		System.out.println("Zafar Sir is pro at Frontend Programming at Royal");
		System.out.println("Zafar Sir takes HTML, CSS, JS, C, Python, etc.");
	}
}

class Method_Overloading {
	public static void main(String[] args) {
		Royal_Faculties faculty = new Royal_Faculties();
		
		faculty.facultyMember(2);		//Krutarth Sir
		System.out.println();
		faculty.facultyMember(2.3f);	//Jay Sir
		System.out.println();
		faculty.facultyMember(222222.3);//Jaynam Sir
		System.out.println();
		faculty.facultyMember("HTML");	//Zafar Sir
	}
}