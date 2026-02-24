class BankRunner {
    public static void main(String[] args) {

        String name = "Megha";
        String type = "Savings";
        double balance = 15000;
        String branch = "Koramangala";

        Bank.account(name, type);
        Bank.account(name, type, balance);
        Bank.account(name, type, balance, branch);

        name = "Vikram";
        type = "Current";
        balance = 75000;
        branch = "Jayanagar";

        Bank.account(name, type);
        Bank.account(name, type, balance);
        Bank.account(name, type, balance, branch);

        name = "Sneha";
        balance = -500;    
        branch = null;     

        Bank.account(name, type);
        Bank.account(name, type, balance);
        Bank.account(name, type, balance, branch);

        name = "Arjun";
        type = null;      
        balance = 20000;
        branch = "Whitefield";

        Bank.account(name, type);
        Bank.account(name, type, balance);
        Bank.account(name, type, balance, branch);
    }
}
