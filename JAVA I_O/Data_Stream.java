import java.io.*;

public class Data_Stream {
    public static void main(String[] args) throws Exception {
        FileOutputStream fout = new FileOutputStream("Output_Text_Files\\Data_Stream.txt");
        DataOutputStream dout = new DataOutputStream(fout);

        dout.writeInt(65);
        dout.flush();
        dout.close();
        System.out.println("Success...");

        DataInputStream din = new DataInputStream(new FileInputStream("Output_Text_Files\\Data_Stream.txt"));

        int i = din.readInt();
        System.out.println((char)i);

    }
}


/*
 * When we write throws Exception in main method, we don't need to write try-catch block as it is already handled by JVM.
 * 
 * DataOutputStream class will create a file that we can't read as it is in binary format.
 */