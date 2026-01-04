package OOPS.Encapsulation.Challenges.BANK.BANKACCOUNT;

public class BankAccount{
    public static int totalAccounts;

    private long accountNumber;
    private String holderName;
    private double accountBalance;

    static{
        System.out.println("******************************Welcome to bank******************************\n");
        totalAccounts=0;
    }

    {
        totalAccounts++;
        accountBalance=0;
    }

    public BankAccount(int accountNumber,
                       String holderName,double accountBalance){
        if(accountBalance<500){
            System.out.println("For opening account balance should be more than 500");
        }
        else{
            this.accountBalance=accountBalance;
            this.holderName=holderName;
            this.accountNumber=accountNumber;
            System.out.println("\n\nThanks for opening bank account "+this.holderName+"\n");
        }
    }

    public String getHolderName(){
        return holderName;
    }

    public void setHolderName(String name){
        this.holderName=name;
    }

    public long getAccountNumber(){
        return accountNumber;
    }

    public double getAccountBalance(){
        return accountBalance;
    }

    public void deposite(double balance){
        if(balance<=0){
            System.out.println("Invalid Balance to deposite");
        }else {
            this.accountBalance += balance;
            System.out.println("Deposite of rs:" + balance + " is succesfull");
        }
    }

    public void withdraw(double balance){
        if(balance>this.accountBalance){
            System.out.println("Insufficient money to withdraw");
        }else if(balance<=0) {
            System.out.println("Invalid money to withdraw");
        }else{
            this.accountBalance -= balance;
            System.out.println("Withdraw of rs:" + balance + " is succesfull");
        }
    }

    public String checkBalance(){
        return "Avl Bal is rs:"+this.accountBalance;
    }

    @Override
    public String toString() {
        return "Account Details=[" +
                "Holder Name="+holderName+
                ",Account Number="+accountNumber+
                ",Account Balance="+accountBalance+
                "]\n";
    }
}

















