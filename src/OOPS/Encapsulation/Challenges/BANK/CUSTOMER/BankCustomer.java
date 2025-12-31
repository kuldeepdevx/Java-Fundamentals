package OOPS.Encapsulation.Challenges.BANK.CUSTOMER;
import OOPS.Encapsulation.Challenges.BANK.BANKACCOUNT.*;

public class BankCustomer {
    public static void main(String[] args) {

        BankAccount Kuldeep = new BankAccount("Kuldeep Rajput",
                1234432123);
        Kuldeep.depositMoney(500000);
        Kuldeep.checkBalance();
        System.out.println(Kuldeep);
    }
}
