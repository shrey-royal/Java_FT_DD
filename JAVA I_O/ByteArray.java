import java.io.*;

public class ByteArray {
    public static void main(String[] args) throws Exception {
        FileOutputStream fout = new FileOutputStream("Output_Text_Files\\ByteArray.txt");
        FileOutputStream fout2 = new FileOutputStream("Output_Text_Files\\ByteArray1.txt");

        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        bout.write(65);
        bout.writeTo(fout);
        bout.writeTo(fout2);

        bout.flush();
        bout.close();// has no effect as the data is not in memory

        System.out.println("Success...");

        byte[] buff = {35, 36, 37, 38};

        ByteArrayInputStream bin = new ByteArrayInputStream(buff);
        int i;
        while((i = bin.read()) != -1) {
            char ch = (char) i;
            System.out.println("ASCII value of Character is:" + i + ";\n Special Character is: " + ch);
        }

    }
}
