import java.io.*;

public class Depersist {
    public static void main(String[] args) {
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("s.txt"));

            Student s = (Student) in.readObject();
            System.out.println("ID: " + s.id + " Name: " + s.name);
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}