package Exception_FileHandling.CustomException;

public class InvalidBalance extends RuntimeException{

    private double amount;

    InvalidBalance(double amount){
        this.amount=amount;
    }

    @Override
    public String getMessage() {
        return "Withdrawal of amount "+amount+" is not valid";
    }

    public double getAmount(){
        return this.amount;
    }

}
