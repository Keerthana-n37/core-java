class PersonRunner{
    public static void main(String[] args) {
		
        String personName = "Aishwarya";
        String[] personEmails = {"aishwarya@gmail.com", "aishu@yahoo.com"};
        long[] personMobiles = {9988776655L, 9876501234L};
        String personAddress = "Mysuru";
        Person.contactInfo(personName, personEmails, personMobiles, personAddress);

        String dishName = "Paneer Butter Masala";
        String[] dishIngredients = {"Paneer", "Butter", "Tomato", "Cream", "Spices"};
        Person.foodDish(dishName, dishIngredients);
		
        String brand = "HP";
        String model = "Pavilion 14";
        String[] ports = {"USB", "HDMI", "Type-C"};
        String[] countries = {"India", "Germany", "Canada"};
        Person.laptop(brand, model, ports, countries);
    }
}
	