package day0227;

public class BankAccount {
    private int accountNo;
    private String ownerName;

    public BankAccount(String ownerName) {
        this.accountNo = AccountCreator.getAccountCreator().getNextAccountNo();
        this.ownerName = ownerName;
    }

    @Override
    public String toString() {
        return this.accountNo + ", " + this.ownerName; 
    }
}

class Test5 {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount("Mark");
        BankAccount bankAccount2 = new BankAccount("jason");
        BankAccount bankAccount3 = new BankAccount("James");

        System.out.println(bankAccount1);
        System.out.println(bankAccount2);
        System.out.println(bankAccount3);
    }
}
