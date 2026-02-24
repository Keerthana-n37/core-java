public class BankRunner {

    public static void main(String[] args) {

        BankAccount b1 = new BankAccount();
		System.out.println("Account Holder: " + b1.accountHolder);
        System.out.println("Account Number: " + b1.accountNumber);
        System.out.println("Account Type: " + b1.accountType);
        System.out.println("Balance: " + b1.balance);
        System.out.println("Re-initialising account details");

        b1.accountHolder = "Ananya Rao";
        b1.accountNumber = 101;
        b1.accountType = "Savings";
        b1.balance = 50000;
        System.out.println("Account Holder: " + b1.accountHolder);
        System.out.println("Account Number: " + b1.accountNumber);
        System.out.println("Account Type: " + b1.accountType);
        System.out.println("Balance: " + b1.balance);
        System.out.println("------------------------------");
		
		
        BankAccount b2 = new BankAccount();
		System.out.println("Account Holder: " + b2.accountHolder);
        System.out.println("Account Number: " + b2.accountNumber);
        System.out.println("Account Type: " + b2.accountType);
        System.out.println("Balance: " + b2.balance);
        System.out.println("Re-initialising account details");
       
        b2.accountHolder = "Vikram Shetty";
        b2.accountNumber = 102;
        b2.accountType = "Current";
        b2.balance = 75000;
        System.out.println("Account Holder: " + b2.accountHolder);
        System.out.println("Account Number: " + b2.accountNumber);
        System.out.println("Account Type: " + b2.accountType);
        System.out.println("Balance: " + b2.balance);
        System.out.println("------------------------------");

        BankAccount b3 = new BankAccount();
		System.out.println("Account Holder: " + b3.accountHolder);
        System.out.println("Account Number: " + b3.accountNumber);
        System.out.println("Account Type: " + b3.accountType);
        System.out.println("Balance: " + b3.balance);
        System.out.println("Re-initialising account details");
        b3.accountHolder = "Rahul Kumar";
        b3.accountNumber = 103;
        b3.accountType = "Savings";
        b3.balance = 60000;
        System.out.println("Account Holder: " + b3.accountHolder);
        System.out.println("Account Number: " + b3.accountNumber);
        System.out.println("Account Type: " + b3.accountType);
        System.out.println("Balance: " + b3.balance);
        System.out.println("------------------------------");

        BankAccount b4 = new BankAccount();
		System.out.println("Account Holder: " + b4.accountHolder);
        System.out.println("Account Number: " + b4.accountNumber);
        System.out.println("Account Type: " + b4.accountType);
        System.out.println("Balance: " + b4.balance);
        System.out.println("Re-initialising account details");
        b4.accountHolder = "Sneha Reddy";
        b4.accountNumber = 104;
        b4.accountType = "Current";
        b4.balance = 80000;
        System.out.println("Account Holder: " + b4.accountHolder);
        System.out.println("Account Number: " + b4.accountNumber);
        System.out.println("Account Type: " + b4.accountType);
        System.out.println("Balance: " + b4.balance);
        System.out.println("------------------------------");

        BankAccount b5 = new BankAccount();
        System.out.println("Account Holder: " + b5.accountHolder);
        System.out.println("Account Number: " + b5.accountNumber);
        System.out.println("Account Type: " + b5.accountType);
        System.out.println("Balance: " + b5.balance);
        System.out.println("Re-initialising account details");
        b5.accountHolder = "Kiran Sharma";
        b5.accountNumber = 105;
        b5.accountType = "Savings";
        b5.balance = 90000;
        System.out.println("Account Holder: " + b5.accountHolder);
        System.out.println("Account Number: " + b5.accountNumber);
        System.out.println("Account Type: " + b5.accountType);
        System.out.println("Balance: " + b5.balance);
        System.out.println("------------------------------");
    }
}

