package Exception_FileHandling.Challenge;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class UserFileOperations {
    static  Scanner input=new Scanner(System.in);

    public static boolean fileFinder(String fileName){
        File file=new File(fileName);
        return file.exists();
    }

    public static void fileWriter(String fileName){
        if(!fileFinder(fileName)) {
            System.out.println("File named " + fileName + " is created");
        }
        try(FileWriter fileWriter=new FileWriter(fileName)){
            System.out.print("Enter what to write:");
            fileWriter.write(input.nextLine());
            System.out.println("Written in file Successfully");
        }catch(IOException e){
            e.getStackTrace();
        }
    }

    public static void fileReader(String fileName){
//        if(!fileFinder(fileName)){
//            throw new FileNotFoundException();
//        }
        try(FileReader fileReader=new FileReader(fileName)) {
            int read;
            while ((read = fileReader.read()) != -1) {
                System.out.print((char) read);
            }
            System.out.println();
        }catch(FileNotFoundException exception){
            System.out.println(fileName+" is not found");
        } catch(IOException e){
            e.getStackTrace();
        }
    }
}
