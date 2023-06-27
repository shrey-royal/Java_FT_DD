/*
Program -> 4 classes -> follows Hybrid Inheritance
-> Covariant Return Type
-> Super Keyword

Problem Statement:
You are tasked with implementing a program to model a university's academic hierarchy. There are four classes involved: Person, Student, Faculty, and TeachingAssistant. The program should demonstrate the concepts of Hybrid Inheritance, Covariant Return Type, and the use of the super keyword.

Class Definitions:
1. Person:
   - Attributes: name (String), age (int)
   - Methods: 
     - A parameterized constructor to initialize the name and age.
     - A displayDetails() method that displays the name and age of the person.

2. Student:
   - Inherits from Person.
   - Additional attributes: rollNumber (String), course (String)
   - Methods:
     - A parameterized constructor to initialize the name, age, rollNumber, and course.
     - Override the displayDetails() method to display the name, age, rollNumber, and course of the student.

3. Faculty:
   - Inherits from Person.
   - Additional attributes: designation (String), department (String)
   - Methods:
     - A parameterized constructor to initialize the name, age, designation, and department.
     - Override the displayDetails() method to display the name, age, designation, and department of the faculty member.

4. TeachingAssistant:
   - Inherits from Student and Faculty (Hybrid Inheritance).
   - Additional attribute: supervisor (String)
   - Methods:
     - A parameterized constructor to initialize the name, age, rollNumber, course, designation, department, and supervisor.
     - Override the displayDetails() method to display the name, age, rollNumber, course, designation, department, and supervisor of the teaching assistant.

Note: In the TeachingAssistant class, the displayDetails() method should make use of the super keyword to call the displayDetails() methods of the Student and Faculty classes.

Your task is to implement the above classes and write a main() method to demonstrate the functionality of the program.

*/

class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void displayDetails() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
}

class Student extends Person {
	private String rollNumber;
	private String course;
	
	public Student(String name, int age, String rollNumber, String course) {
		super(name, age);
		this.rollNumber = rollNumber;
		this.course = course;
	}
	
	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("rollNumber: " + rollNumber);
		System.out.println("course: " + course);
	}
}

class Faculty extends Person {
	private String designation;
	private String department;
	
	public Faculty(String name, int age, String designation, String department) {
		super(name, age);
		this.designation = designation;
		this.department = department;
	}
	
	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("designation: " + designation);
		System.out.println("department: " + department);
	}
}

class TeachingAssistant extends Student {
	private Faculty faculty;
	private String supervisor;
	
	public TeachingAssistant(String name, int age, String rollNumber, String course, String designation, String department, String supervisor) {
		super(name, age, rollNumber, course);
		this.faculty = new Faculty(name, age, designation, department);
		this.supervisor = supervisor;
	}
	
	@Override
	public void displayDetails() {
		super.displayDetails();
		faculty.displayDetails();
		System.out.println("supervisor: " + supervisor);
	}
}

public class UniversityHierarchy {
	public static void main(String[] args) {
		Student student = new Student("Dhruv Panwala", 19, "2021001", "Artificial Intelligence");
		student.displayDetails();
		System.out.println();
		
		Faculty faculty = new Faculty("Krutarth Sir", 21, "Professor", "Computer Science");
		faculty.displayDetails();
		System.out.println();
		
		TeachingAssistant ta = new TeachingAssistant("Shrey Sir", 20, "2021002", "Mathematics", "Teaching Assistant", "Mathematics", "Krutarth Sir");
		ta.displayDetails();
	}
}