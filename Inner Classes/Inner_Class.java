/*

Inner Class: 

Q. What is Inner Class?
Ans. Inner class is a class which is defined inside another class.

Q. Why use Inner Class?
Ans. Inner class is used to access the private members of a class.

Q. How many types of Inner Class?
Ans. There are 4 types of Inner Class.
1. Member Inner Class
2. Static Inner Class
3. Local Inner Class
4. Anonymous Inner Class

Q. What is Member Inner Class?
Ans. Member Inner Class is a class which is defined inside another class but outside the method.
syntax: class OuterClass{
    class InnerClass{
        //code
    }
}

Q. What is Static Inner Class?
Ans. Static Inner Class is a class which is defined inside another class but outside the method and declared as static.
syntax: class OuterClass{
    static class InnerClass{
        //code
    }
}

Q. What is Local Inner Class?
Ans. Local Inner Class is a class which is defined inside a method.
syntax: class OuterClass{
    void method(){
        class InnerClass{
            //code
        }
    }
}

Q. What is Anonymous Inner Class?
Ans. Anonymous Inner Class is a class which is defined inside a method without name.

Advantages of Inner Class:

1. Code Optimization: It requires less code to write.
2. Readable and Maintainable Code: It is easy to read and maintain the code.
3. Code Reusability: It is easy to reuse the code.
4. Accessing Private Members: It is easy to access the private members of a class.



*/



class Member_Class {    // Outer Class
    private int var = 10;

    class Inner_Member_Class {  // Inner Class
        void display() {
            System.out.println("Value of var is: " + var);
        }
    }
}

class Static_Class {
    static int var = 10;

    static class Inner_Static_Class {
        void display() {
            System.out.println("Value of var is: " + var);
        }
    }
}

class Local_Class {
    void method() {
        class Inner_Local_Class {
            void display() {
                System.out.println("Inside Local Class");
            }
        }
        Inner_Local_Class obj = new Inner_Local_Class();
        obj.display();
    }
}


class Anonymous_Class {
    
    public void method() {
        Inner_Anonymous_Class obj = new Inner_Anonymous_Class() {
            @Override
            void eat() {
                System.out.println("Eating");
            }
        };
        obj.eat();
    }

    //Inner class
    abstract class Inner_Anonymous_Class {
        abstract void eat();
    }
}




public class Inner_Class {

    public static void main(String[] args) {
        // Member_Class obj = new Member_Class();
        // Member_Class.Inner_Member_Class obj1 = obj.new Inner_Member_Class();
        // obj1.display();

        // Static_Class.Inner_Static_Class obj = new Static_Class.Inner_Static_Class();
        // obj.display();

        // Local_Class obj = new Local_Class();
        // obj.method();

        Anonymous_Class obj = new Anonymous_Class();
        obj.method();

    }

}