package OOPS.Encapsulation.Challenges.BANK.BANKACCOUNT;

public class BankAccount {

    private String accountHolderName;
    private long accountNumber;
    private double Balance;

    static {
        System.out.println("*********************WELCOME TO OUR BANK*********************\n");
    }

    public BankAccount(String accountHolderName,
                       long accountNumber){
        this.accountHolderName=accountHolderName;
        this.accountNumber=accountNumber;
            System.out.println("Thanks for opening bank account\n");
    }

    @Override
    public String toString() {
        StringBuilder accountInfo=new StringBuilder();
        accountInfo.append("Account Information[");
        return accountInfo.append("Account no:").append(this.accountNumber)
                .append(",Holder Name=").append(this.accountHolderName)
                .append(",Balance=").append(this.Balance)
                .append("]").toString();
    }

    public void setAccountHolderName(String accountHolderName){
        this.accountHolderName=accountHolderName;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void depositMoney(double money){
        if(money<=0){
            System.out.println("Deposit should be positive");
        }else {
            this.Balance += money;
            System.out.println("Deposit of rs-" + money + "/ is successful");
        }
    }

    public void withdrawMoney(double money){
        if(money<=0){
            System.out.println("Withdraw should be in positive");
        }else if(money>this.Balance){
            System.out.println("Insufficient Balance!");
        }else {
            this.Balance -= money;
            System.out.println("Withdraw of " + money + " is successful");
        }
    }

    public void checkBalance(){
        System.out.println("Your Account Balance is "+this.Balance);
    }

}
