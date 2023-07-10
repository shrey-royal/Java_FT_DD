import java.io.IOException;

public class Basic {
    public static void main(String[] args) {
        
        System.out.println("Simple Message");
        System.err.println("Error Message");


        try {
            int i = System.in.read();   // read() method returns ASCII value of 1st character
            System.out.println((char)i + " = " + i);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
