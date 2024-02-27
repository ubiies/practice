package day0226.Starter;

import java.math.BigDecimal;

public class Test {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        account1.setData("James",new BigDecimal("100.0"));
        BankAccount account2 = new BankAccount();
        account2.setData("Mark",new BigDecimal("200.0"));

        System.out.println("Before transfer : ");
        displayAccountInfo(account1);
        displayAccountInfo(account2);
        System.out.println(account1);
        System.out.println(account2);

        account1.transferFrom(account2, new BigDecimal("10.0"));
    }

    public static void displayAccountInfo(BankAccount account) {
        System.out.println("Account No : " + account.accountNumber + " Owner Name : " + account.ownerName + " Balance : " + account.getBalance());
    }
}
