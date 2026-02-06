package Exception_FileHandling.Exception.CustomException;

public class Customer {
    public static void main(String[] args){

        Bank customer1=new Bank(500);

        customer1.Withdraw(-100);
    }
}
