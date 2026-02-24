class MobileRunner {

    public static void main(String[] args) {

        double price = MobileStore.getPrice("SAMSUNG");
        System.out.println("Price: " + price);

        int warranty = MobileStore.getWarranty("APPLE");
        System.out.println("Warranty: " + warranty + " years");

        String country = MobileStore.getCountry("VIVO");
        System.out.println("Country: " + country);
    }
}
