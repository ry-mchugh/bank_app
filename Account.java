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

    // function to calculate interest after x number of years
    void calcInterest(int years) {
        double interestRate = .0155;
        double newBalance = (balance * interestRate * years) + balance;
        System.out.println("Current interest rate is " + (100 * interestRate) + "%");
        System.out.println("After " + years + " years, your balance will be: " + newBalance);
    }

    void menu() {
        char option = '\0';
        Scanner scanner = new Scanner(system.in);
        System.out.println("Welcome, " + customerName + ".");
        System.out.println("Your ID is: " + customerID);
        System.out.println();
        System.out.println("What would you like to do?");
        System.out.println();
        System.out.println("A. Check balance");
        System.out.println("B. Make a deposit");
        System.out.println("C. Make a withdrawal");
        System.out.println("D. View previous transaction");
        System.out.println("E. Calculate interest");
        System.out.println("F. Exit");

        do {
            System.out.println();
            System.out.println("Enter an option: ");
            char option1 = scanner.next().charAt(0);
            option = Character.toUpperCase(option1);
            System.out.println();

            switch(option) {
                case 'A':
                    System.out.println("++++++++++++++++++++++");
                    System.out.println("Balance = £" + balance);
                    System.out.println("++++++++++++++++++++++");
                    System.out.println();
                    break;

                case 'B':
                    System.out.println("Enter an amount to deposit: ");
                    int amount = scanner.nextInt();
                    deposit(amount);
                    System.out.println();
                    break;


            }
        }
    }
}
