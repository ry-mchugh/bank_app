import java.util.Scanner;
public class Account {
    // class variables
    int balance;
    int prevTransaction;
    String customerName;
    String customerID;

    // class constructor
    Account(String cname, String cid) {
        customerName = cname;
        customerID = cid;
    }

    // function to deposit money
    void deposit(int amount) {
        if (amount != 0) {
            balance = balance + amount;
            prevTransaction = amount;
        }
    }

    // function to withdraw money
    void withdraw(int amount) {
        if (amount != 0) {
            balance = balance - amount;
            prevTransaction = -amount;
        }
    }

    // function to show the previous transation
    void getPrevTransaction() {
        if (prevTransaction > 0) {
            System.out.println("Deposited: " + prevTransaction);
        } else if (prevTransaction < 0) {
            System.out.println("Withdraw: " + Math.abs(prevTransaction));
        } else {
            System.out.println("No transaction happened");
        }
    }

}
