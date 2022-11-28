package JavaFiles;
import java.io.File;
import java.io.IOException;

public class FileCreation {
    public static void main(String[] args) {
        File file = new File("newFile.txt");
        try {
            boolean value =file.createNewFile();
            if(value){
                System.out.println("New File Created");
            }else {
                System.out.println("File already Exists");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
