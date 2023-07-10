import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputstream {
    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("Output_Text_Files\\fout.txt");
            // fout.write(65);
            fout.write("Hello World!".getBytes());
            String str = "Hello World";
            byte b[] = str.getBytes();
            fout.write(b);
            fout.close();
            System.out.println("Success...");     
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
