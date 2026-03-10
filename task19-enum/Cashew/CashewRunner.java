class CashewRunner{
    public static void main(String[] args){

        Supplier supplier1 = new Supplier("NutriCorp", "9876543210", "California");
        Cashew cashew1 = new Cashew(100, supplier1, CashewType.RAW);
        cashew1.printInfo();

        Supplier supplier2 = new Supplier("HealthyFoods", "9123456780", "Oregon");
        Cashew cashew2 = new Cashew(200, supplier2, CashewType.ROASTED);
        cashew2.printInfo();

        Supplier supplier3 = new Supplier("FreshFarm", "9988776655", "Texas");
        CashewType type=CashewType.SALTED;
        Cashew cashew3 = new Cashew(150, supplier3,type);
        cashew3.printInfo();

        Supplier supplier4 = new Supplier("GlobalNuts", "9012345678","Arizona");
        CashewType type1=CashewType.FLAVORED;
        Cashew cashew4 = new Cashew(120, supplier4,type1);
        cashew4.printInfo();
    }
}