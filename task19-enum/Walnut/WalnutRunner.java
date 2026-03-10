class WalnutRunner{
    public static void main(String[] args){

        Supplier supplier1 = new Supplier("NutriSupply", "California");
        Walnut walnut1 = new Walnut(100, supplier1, WalnutType.ENGLISH);
        walnut1.printInfo();

        Supplier supplier2 = new Supplier("HealthyNuts", "Oregon");
        Walnut walnut2 = new Walnut(200, supplier2, WalnutType.BLACK);
        walnut2.printInfo();

        Supplier supplier3 = new Supplier("WalnutWorld", "Himalayas");
        WalnutType type=WalnutType.HIMALAYAN;
        Walnut walnut3 = new Walnut(150, supplier3, type);
        walnut3.printInfo();

        Supplier supplier4 = new Supplier("NutFarm", "Arizona");
        WalnutType type1=WalnutType.WHITE;
        Walnut walnut4 = new Walnut(120, supplier4,type1);
        walnut4.printInfo();
    }
}