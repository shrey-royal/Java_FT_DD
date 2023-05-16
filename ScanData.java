import java.util.Scanner;

public class ScanData {
	public static void main(String[] args) {
		//int number = 6;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any Integer: ");
		int number = sc.nextInt();
		
		System.out.println("Enter any Character: ");
		String ch = sc.next();	//word
		
		sc.nextLine();	//Buffer
		System.out.println("Enter any String: ");
		String str = sc.nextLine();	//line
		
		System.out.println("Enter any Floating Number: ");
		float f = sc.nextFloat();
		
		System.out.println("Enter Double number: ");
		double d = sc.nextDouble();
		
		
		System.out.println("Integer: " + number);
		System.out.println("Character: " + ch);
		System.out.println("String: " + str);
		System.out.println("Float: " + f);
		System.out.println("Double: " + d);
		
		
	}
}

/*
To take input from the user in Java we will have to use Scanner Class.

package java.util.Scanner;

package is collection of multiple similar classes that can be stored in groups.

to use this class we have to import the class first1:

> import java.util.Scanner;	//specific class will be imported
> import java.util.*;	//will import the classes included in the util folder.

Scanner class have multiple methods to scan different types of data

int - nextInt();
float - nextFloat();
char - next();
double - nextDouble();
String - nextLine();


Class_name obj_name;	//object declare
//instantiate the object
obj_name = new Class_name();	//instatiation

className obj = new className();

Scanner class -> object creation:

Scanner sc = new Scanner(System.in);	//scanner object created

*/