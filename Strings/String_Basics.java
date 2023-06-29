/*
 * String is not a primitive data type in Java. It is a class.
 * 
 * Type conversion: 
 *  1. Implicit type conversion:
 *      - byte -> short -> int -> long -> float -> double    (widening)
 * 
 * 2. Explicit type conversion:
 *      - double -> float -> long -> int -> short -> byte    (narrowing)
 * 
 * We need to use wrapper classes for explicit type conversion.
 * 
 * Wrapper classes:
 * - Byte -> byte
 * - Short -> short
 * - Integer -> int
 * - Long -> long
 * - Float -> float
 * - Double -> double
 * - Character -> char
 * - Boolean -> boolean
 * 
 * a method called parseXXXX() is available in each wrapper class to convert a string to a primitive type. where XXXX is the name of the primitive type.
 * 
 * for example:
 * 
 * int i = Integer.parseInt("123");
 * float f = Float.parseFloat("123.45");
 * double d = Double.parseDouble("123.45");
 * Boolean b = Boolean.parseBoolean("true");
 * char c = Character.parseCharacter("a");
 * byte b = Byte.parseByte("123");
 * 
 * 
 * to convert any primitive datatype to an object we need to use Wrapper classes.
 * 
 * String abc = "123";  //object
 * 
 * 
 */

 import java.util.Scanner;

public class String_Basics {
    public static void main(String[] args) {
        String str;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        str = sc.nextLine();

        System.out.println(System.identityHashCode(str));   //this will give the hashcode of the object.

        System.out.println("The string is: " + str);

        str = "abc";    // a new object is created since string objects are immutable. 
        System.out.println(System.identityHashCode(str));   //this will give the hashcode of the object.


        System.out.println("The string is: " + str);

        sc.close(); //this is not mandatory. but it is a good practice to close the scanner object.
    }
}

/*
 * To create a string
 * 
 * 1. String literal: String s = "abc";
 * 2. new keyword: String s1 = new String("abc");
 * 
 * String s = "abc";
 * String s1 = "abc";   //it doesn't create a new object. it will point to the same object.
 * 
 * s and s1 are pointing to the same object.
 * 
 * when we use new keyword, it will create a new object. everytime
 * 
 * String s = new String("abc");
 * String s1 = new String("abc");//it will create a new object.
 * 
 * both are different objects.
 * 
 * A HASHCODE is a unique number that is generated when an object is created. it is used to identify the object.
 * 
 */