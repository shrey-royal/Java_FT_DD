import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Throw_Throws {
    
    public static void validate(int age) {
        if (age < 18) {
            //throw ArithmeticException if not eligible to vote
            throw new ArithmeticException("Person is not eligible to vote");
        } else {
            System.out.println("Welcome to vote");
        }
    }

    public static void getFile() throws FileNotFoundException {
        FileReader file = new FileReader("Exceptions\\test.txt");
        BufferedReader fileInput = new BufferedReader(file);

        throw new FileNotFoundException("File not found");
    }
    
    public static void main(String[] args) {
        // validate(12);
        
        try {
            getFile();
        } catch (FileNotFoundException e) {
            // e.printStackTrace();
            System.out.println(e.getMessage());
        }
        System.out.println("Rest of the code");
    }    
}
