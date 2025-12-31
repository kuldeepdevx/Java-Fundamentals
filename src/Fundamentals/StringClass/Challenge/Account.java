package Fundamentals.StringClass.Challenge;
import java.util.Date;
class Account {
    final double accountNum;
    final String IFSCcode;
    final String holderName;

    Account(String holderName,
            String IFSCcode, int accountNum){
        this.holderName=holderName;
        this.IFSCcode=IFSCcode;
        this.accountNum=accountNum;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Account{");
        sb.append("accountNum=").append(accountNum);
        sb.append(", IFSCcode='").append(IFSCcode).append('\'');
        sb.append(", holderName='").append(holderName).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public static void main(String[] args){

        Account kuldeep=new Account(
                "Kuldeep",
                "SBIBANK1000",123456789);

        System.out.println(kuldeep);
    }
}
