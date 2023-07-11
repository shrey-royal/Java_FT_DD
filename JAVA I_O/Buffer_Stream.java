import java.io.*;

public class Buffer_Stream {
    public static void main(String[] args) throws Exception {
        FileOutputStream fout = new FileOutputStream("Output_Text_Files\\buffered_out.txt");
        BufferedOutputStream bout = new BufferedOutputStream(fout);

        String s = "Welcome to Java Programming";
        byte[] b = s.getBytes();

        bout.write(b);
        bout.flush();   // flushes the data from buffer to file
        bout.close();
        fout.close();

        BufferedInputStream bin = new BufferedInputStream(new FileInputStream("Output_Text_Files\\buffered_out.txt"));

        int i;
        while((i = bin.read()) != -1) {
            System.out.print((char)i);
        }

        bin.close();

        // System.out.println("Success...");
    }
}
/*
BufferedOutputStream class is used to write primitive data types to the output stream.
It internally uses FileOutputStream to write data into the file.

BufferedInputStream class is used to read primitive data types from the input stream.
It internally uses FileInputStream to read data from the file.

> these classes have buffer memory to improve the performance.
*/