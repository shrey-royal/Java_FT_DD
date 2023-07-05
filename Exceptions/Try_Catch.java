import java.util.Scanner;

public class Try_Catch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //ArithmeticException
        // System.out.println((12/0));

        //classnotfoundexception
        // Class.forName("com.mysql.jdbc.Driver");

        int a, b;
        System.out.println("Enter two numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        int arr[] = new int[5];

        // if (b == 0) {
        //     System.out.println("Division by zero is not possible");
        // } else {
        //     System.out.println("Division is: " + (a / b));
        // }

        try {
            System.out.println("Division is: " + (a / b));
            // Class.forName("com.mysql.jdbc.Driver");
            int s = arr[6];
        } catch (Exception e) {
            e.printStackTrace();
            // System.out.println("Division by zero is not possible");
        } finally {
            System.out.println("This is finally block");
            sc.close();
        }
    }
}
/*
    Exception Handling in Java
    
    Exception Handling is a mechanism to handle runtime errors


    error vs exception
    error occurs when the program is running and it is difficult to recover from it
    exception occurs when the program is running and it is possible to recover from it

    They are used to maintain the normal flow of the application. It is recommended to handle the exception at the lowest level of abstraction possible.

    statement 1;
    statement 2;
    statement 3; // exception occurs
    statement 4;
    statement 5;

    > here statement 4 and 5 will not be executed because exception occurs at statement 3 and the program will terminate abnormally. But, if we handle the exception, the rest of the statements will be executed.


    1. try catch block

    try {
        // statements that may cause an exception
    } catch (exception_class e) {
        // error handling code
    }

    > try block contains the code that may throw an exception
    > catch block contains the code that handles the exception. It must be preceded by try block which means we can't use catch block alone. It can be followed by finally block later.

    > try block must be followed by either catch or finally block or both.

    finally block
    > finally block is used to execute important code such as closing connection, stream etc.


    Checked vs Unchecked Exceptions
    > Checked exceptions are checked at compile-time. It means if a method is throwing a checked exception then it should handle the exception using try-catch block or it should declare the exception using throws keyword, otherwise the program will give a compilation error.

    > Unchecked exceptions are not checked at compile-time, but they are checked at runtime. It means if your program is throwing an unchecked exception and even if you didn't handle/declare that exception, the program won't give a compilation error. For example, ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException etc.
*/