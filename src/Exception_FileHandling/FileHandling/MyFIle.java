package Exception_FileHandling.FileHandling;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MyFIle {
    public static void main(String[] args) throws IOException {
        Scanner input=new Scanner(System.in);
        try(FileWriter fw=new FileWriter("a.txt",true)){
            System.out.print("Enter your full name:");
            fw.write(input.nextLine());
        }catch(IOException e){
            System.out.println("error occurred");
        }
    }
}
