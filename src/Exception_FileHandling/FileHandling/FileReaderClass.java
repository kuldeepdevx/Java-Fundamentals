package Exception_FileHandling.FileHandling;
import java.io.IOException;
import java.io.FileReader;

public class FileReaderClass {
    public static void main(String[] args) throws IOException {
        try (FileReader fr = new FileReader("myFile");) {
            char[] cBuff = new char[50];
            int character;
            while ((character = fr.read(cBuff)) != -1) {
                System.out.print(new String(cBuff, 0, character));
            }
        }catch(IOException e){
            System.out.println("Exception occurred "+e.getMessage());
        }
    }
}
