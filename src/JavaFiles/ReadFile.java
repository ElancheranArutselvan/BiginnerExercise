package JavaFiles;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        char[] text = new char[100];
        try {
            FileReader fileReader = new FileReader("newFile.txt");
            fileReader.read(text);
            System.out.println(" data in the file ");
            System.out.println(text);
            fileReader.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
