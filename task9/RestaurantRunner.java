class RestaurantRunner {
    public static void main(String[] args) {

        String item = "Pizza";
        int quantity = 2;
        String customerName = "Ananya";
        String paymentMode = "UPI";

        Restaurant.order(item);
        Restaurant.order(item, quantity);
        Restaurant.order(item, quantity, customerName, paymentMode);

        item = "Burger";
        quantity = 3;
        customerName = "Rahul";
        paymentMode = "Card";

        Restaurant.order(item);
        Restaurant.order(item, quantity);
        Restaurant.order(item, quantity, customerName, paymentMode);

        item = null;
        Restaurant.order(item);

        item = "Sandwich";
        quantity = -1;
        Restaurant.order(item, quantity);

        item = "Dosa";
        quantity = 2;
        customerName = null;
        paymentMode = "Cash";
        Restaurant.order(item, quantity, customerName, paymentMode);
    }
}
