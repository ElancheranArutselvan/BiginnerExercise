package JavaFiles;

import java.io.FileReader;
import java.io.FileWriter;

public class WriteFile {
    public static void main(String[] args) {
        String input = "Hello everyone, enjoy the party in your own way ";
        try {
            FileWriter fileWriter = new FileWriter("newFile.txt");
            fileWriter.write(input);
            System.out.println(" data written in the file ");
            fileWriter.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
