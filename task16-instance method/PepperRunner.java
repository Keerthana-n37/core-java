class PepperRunner {

    public static void main(String[] args) {

        Pepper pepper = new Pepper(1, "Black Pepper", "Spice", "Everest",
                2023, "Kerala", 5000, 250.5, "Cooking", "Medicine",
                true, "A Grade", 20, "India", "www.everestspices.com",
                85.5, "Everest Foods", 100000, 4.8, "Grocery");
        pepper.pepperDetails();

        Pepper pepper1 = new Pepper(2, "White Pepper", "Spice", "MDH",
                2023, "Tamil Nadu", 4000, 300.0, "Cooking", "Seasoning",
                true, "Premium", 18, "India", "www.mdhspices.com",
                80.0, "MDH Pvt Ltd", 80000, 4.6, "Grocery");
        pepper1.pepperDetails();

        Pepper pepper2 = new Pepper(3, "Green Pepper", "Spice", "Catch",
                2023, "Karnataka", 3000, 220.0, "Cooking", "Pickles",
                false, "Standard", 15, "India", "www.catchfoods.com",
                75.0, "Catch Foods", 60000, 4.5, "Grocery");
        pepper2.pepperDetails();
		
		Pepper pepper3 = new Pepper(4, "Red Pepper", "Spice", "Aachi",
                2023, "Andhra Pradesh", 3500, 210.5, "Cooking", "Sauces",
                true, "A Grade", 12, "India", "www.aachigroup.com",
                70.0, "Aachi Masala", 50000, 4.4, "Grocery");
        pepper3.pepperDetails();

        Pepper pepper4 = new Pepper(5, "Crushed Pepper", "Spice", "Eastern",
                2023, "Kerala", 2800, 260.0, "Cooking", "Pizza Topping",
                true, "Premium", 10, "India", "www.eastern.in",
                68.5, "Eastern Condiments", 45000, 4.3, "Grocery");
        pepper4.pepperDetails();

        Pepper pepper5 = new Pepper(6, "Pepper Powder", "Spice", "Priya",
                2023, "Telangana", 3200, 230.0, "Cooking", "Snacks",
                false, "Standard", 9, "India", "www.priyafoods.com",
                65.0, "Priya Foods", 40000, 4.2, "Grocery");
        pepper5.pepperDetails();

        Pepper pepper6 = new Pepper(7, "Organic Black Pepper", "Spice", "24 Mantra",
                2023, "Karnataka", 2000, 350.0, "Cooking", "Health Drinks",
                true, "Organic Grade", 8, "India", "www.24mantra.com",
                72.0, "24 Mantra Organic", 38000, 4.7, "Organic Grocery");
        pepper6.pepperDetails();

        Pepper pepper7 = new Pepper(8, "Malabar Pepper", "Spice", "Everest",
                2023, "Kerala", 1500, 400.0, "Cooking", "Export",
                true, "Export Quality", 6, "India", "www.everestspices.com",
                75.5, "Everest Foods", 30000, 4.6, "Grocery");
        pepper7.pepperDetails();

        Pepper pepper8 = new Pepper(9, "Pepper Flakes", "Spice", "Catch",
                2023, "Gujarat", 2200, 270.0, "Cooking", "Fast Food",
                false, "Standard", 7, "India", "www.catchfoods.com",
                60.0, "Catch Foods", 25000, 4.1, "Grocery");
        pepper8.pepperDetails();

        Pepper pepper9 = new Pepper(10, "Premium Pepper", "Spice", "MDH",
                2023, "Tamil Nadu", 1800, 420.0, "Cooking", "Export",
                true, "Premium Grade", 5, "India", "www.mdhspices.com",
                78.0, "MDH Pvt Ltd", 20000, 4.8, "Grocery");
        pepper9.pepperDetails();
    }
}