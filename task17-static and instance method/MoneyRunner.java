class MoneyRunner{

    public static void main(String[] args){

        Money money1=new Money();
        money1.earn();
        money1.spend();
        money1.save();
        money1.invest();
        money1.deposit();
        money1.withdraw();
        money1.transfer();
        money1.donate();
        money1.borrow();
        money1.lend();
        money1.count();
        money1.exchange();
        money1.budget();
        money1.calculateInterest();
        money1.payBill();
        System.out.println("-------------------");

        Money money2 =new Money();
        money2.earn();
        money2.spend();
        money2.save();
        money2.invest();
        money2.deposit();
        money2.withdraw();
        money2.transfer();
        money2.donate();
        money2.borrow();
        money2.lend();
        money2.count();
        money2.exchange();
        money2.budget();
        money2.calculateInterest();
        money2.payBill();
        System.out.println("-------------------");

        Money.currency();
        Money.symbol();
        Money.centralBank();
        Money.digitalMode();
        Money.importance();
    }
}