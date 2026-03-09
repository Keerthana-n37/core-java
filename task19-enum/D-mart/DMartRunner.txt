class DMartRunner{
    public static void main(String[] args){

        Manager m1 = new Manager("Ramesh Kumar", 10);
        StoreType type1 = StoreType.SUPERMARKET;
        DMart d1 = new DMart(1000, m1, type1);
        d1.printInfo();

        Manager m2 = new Manager("Sita Sharma", 15);
        DMart d2 = new DMart(1500, m2, StoreType.HYPERMARKET);
        d2.printInfo();

        Manager m3 = new Manager("Vikram Singh", 12);
        StoreType type3 = StoreType.MEGASTORE;
        DMart d3 = new DMart(2000, m3, type3);
        d3.printInfo();

        Manager m4 = new Manager("Anita Verma", 20);
        DMart d4 = new DMart(2500, m4, StoreType.DISCOUNT_STORE);
        d4.printInfo();
    }
}