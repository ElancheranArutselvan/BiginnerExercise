package JavaFiles;

import java.io.FileInputStream;

public class FISRead {
    public static void main(String args[]) {

        try {
            FileInputStream obj = new FileInputStream("newFile.txt");

            System.out.println("Data in the file: ");

            // Reads the first byte
            int i = obj.read();
            while (i!=-1){
                System.out.print((char)i);
                i = obj.read();
            }
            obj.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}