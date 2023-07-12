import java.io.*;

public class Persist {
    public static void main(String[] args) {
        try {
            //creating object
            Student s = new Student(421, "Dhruvbhai");

            //creating stream and writing object
            FileOutputStream fout = new FileOutputStream("s.txt");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(s);
            out.flush();
            out.close();

            System.out.println("success");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
