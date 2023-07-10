import java.io.FileInputStream;
import java.io.IOException;

public class FileInputstream {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("Output_Text_Files\\fout.txt");
            // int i = fin.read();
            // System.out.println((char) i);

            //scan all the characters
            int i = 0;
            while ((i = fin.read()) != -1) {
                System.out.print((char) i);
            }


            fin.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


/*
 * Write 5 lines about the difference between FileInputStream and FileOutputStream.
 * > add that lines into a file called "FileInputstream.txt" and save it.
 * >  then use FileInputStream to read the file and print the lines.
 */