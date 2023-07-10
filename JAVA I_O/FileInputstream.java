import java.io.FileInputStream;
import java.io.IOException;

public class FileInputstream {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("Output_Text_Files\\fout.txt");
            int i = fin.read();
            System.out.println((char) i);
            fin.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
