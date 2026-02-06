package Exception_FileHandling.Exception.CustomException;

public class Bank {
    private double balance;

    Bank(int balance){
        if(balance<0){
            throw new InvalidBalance(balance);
        }
        this.balance=balance;
    }

    public void Withdraw(double balance){
        if(balance>this.balance || balance<0){
            throw new InvalidBalance(balance);
        }
        this.balance-=balance;
        System.out.println("Withdrawal of amount "+balance+" is successful");
    }
}
