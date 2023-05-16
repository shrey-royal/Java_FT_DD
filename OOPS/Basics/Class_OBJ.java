import java.util.Scanner;

class Student {
	private int roll_no, marks, grade;	//public by default
	private String name;
	
	
	void scanDetails(int rno, String n, int m, int g) {
		roll_no = rno;
		name = n;
		marks = m;
		grade = g;
	}	
	
	void print(){
		System.out.println("ROll No.: " + roll_no);
		System.out.println("Name: " + name);
		System.out.println("Marks: " + marks);
		System.out.println("Grade: " + grade);
	}
	
}


class Class_OBJ {
	public static void main(String[] args) {
		//Student s;			//object declaration
		//s = new Student();	//object instantiation
		Student s = new Student();
		
		s.scanDetails(22, "Shrey", 67, 4);
		
		s.print();
	}
}