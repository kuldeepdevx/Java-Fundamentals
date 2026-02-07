package Exception_FileHandling.Challenge;
import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter file name:");
        String fileName=input.nextLine();
        int choice;
        do{
            System.out.print("Enter choice:\n" +
                               "1 for read\n" +
                               "2 for write\n" +
                               "0 for exit\n" +
                               "Enter:");
            choice=input.nextInt();
            switch(choice){
                case 1:UserFileOperations.fileReader(fileName);
                break;
                case 2:UserFileOperations.fileWriter(fileName);
                break;
                case 0:break;
                default:System.out.println("!invalid input");
            }
        }while(choice!=0);
    }
}
