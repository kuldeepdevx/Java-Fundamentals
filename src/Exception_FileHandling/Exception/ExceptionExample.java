package Exception_FileHandling.Exception;
import java.util.Scanner;

public class ExceptionExample {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.print("Enter first num:");
        double a=input.nextDouble();
        System.out.print("Enter second num:");
        double b=input.nextDouble();
        try{
            double result=a/b;
            System.out.println("result is "+result);
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
            System.out.println("Enter valid num for output");
        }catch(Exception e){
            System.out.println("Last exception");
        }
    }
}
