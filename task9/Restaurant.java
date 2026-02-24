class Restaurant {

    static void order(String item) {
        System.out.println("Executing order method with item");
        System.out.println("Item: " + item);

        if(item == null){
            System.out.println("Invalid item");
            return;
        }

        System.out.println("Order accepted");
        System.out.println("-------------------");
    }

    static void order(String item, int quantity) {
        System.out.println("Executing overloaded order with item, quantity");
        System.out.println("Item: " + item);
        System.out.println("Quantity: " + quantity);

        if(item == null){
            System.out.println("Invalid item");
            return;
        }
        if(quantity <= 0){
            System.out.println("Invalid quantity");
            return;
        }

        System.out.println("Order accepted");
        System.out.println("-------------------");
    }

    static void order(String item, int quantity, String customerName, String paymentMode) {
        System.out.println("Executing overloaded order with full details");
        System.out.println("Item: " + item);
        System.out.println("Quantity: " + quantity);
        System.out.println("Customer: " + customerName);
        System.out.println("Payment: " + paymentMode);

        if(item == null){
            System.out.println("Invalid item");
            return;
        }
        if(quantity <= 0){
            System.out.println("Invalid quantity");
            return;
        }
		if(customerName == null){
            System.out.println("Invalid customer name");
            return;
        }
		if(paymentMode == null){
            System.out.println("Invalid payment mode");
            return;
        }

        System.out.println("Order accepted");
        System.out.println("-------------------");
    }
}
