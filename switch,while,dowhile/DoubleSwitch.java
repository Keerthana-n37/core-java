class DoubleSwitch {

    static void smallDiscount() {
        System.out.println("Small Discount: 5%");
        calculateFinalPrice(1000, 5);
    }

    static void mediumDiscount() {
        System.out.println("Medium Discount: 10%");
        calculateFinalPrice(2000, 10);
    }

    static void highDiscount() {
        System.out.println("High Discount: 15%");
        calculateFinalPrice(1500, 15);
    }

    static void veryHighDiscount() {
        System.out.println("Very High Discount: 20%");
        calculateFinalPrice(3000, 20);
    }

    static void specialDiscount() {
        System.out.println("Special Discount: 25%");
        calculateFinalPrice(5000, 25);
    }

    static void calculateFinalPrice(double price, double percent) {
        double discounted = price - (price * percent / 100);
        System.out.println("Original Price: " + price + " Discounted Price: " + discounted);
    }
}