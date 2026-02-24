class HappyDentRunner {
    public static void main(String[] args)
    {
        HappyDent happyDent1 = new HappyDent();
        happyDent1.name = "HappyDent White";
        happyDent1.brand = "Perfetti";
        happyDent1.flavor = "Mint";
        happyDent1.color = "White";
        happyDent1.price = 10;
        happyDent1.weight = 5;
        happyDent1.quantity = 1;
        happyDent1.shelfLife = 12;
        happyDent1.rating = 5;
        happyDent1.sugarFree = true;
        happyDent1.available = true;
        happyDent1.imported = false;
        happyDent1.safe = true;
        happyDent1.shape = "Rectangle";
        happyDent1.packingType = "Blister";
        happyDent1.manufactureDate = "01-01-2026";
        happyDent1.expiryDate = "01-01-2027";
        happyDent1.batchNumber = "HD123";
        happyDent1.licenseNumber = "LIC456";
        happyDent1.distributor = "XYZ Traders";
        happyDent1.category = "Chewing Gum";
        happyDent1.targetAgeGroup = "All";
        happyDent1.texture = "Soft";
        happyDent1.usage = "Chew";
        happyDent1.certification = "FSSAI";
        happyDent1.storeLocation = "DMart";
        happyDent1.barcode = "987654321";
        happyDent1.promoCode = "SAVE10";
        happyDent1.ingredients = new String[]{"Sugar", "Mint", "Flavor"};
        happyDent1.availableCities = new String[]{"Bangalore", "Chennai", "Hyderabad"};

        System.out.println("HappyDent1 Details:");
        System.out.println("Name:" + happyDent1.name);
        System.out.println("Brand:" + happyDent1.brand);
        System.out.println("Flavor:" + happyDent1.flavor);
        System.out.println("Price:" + happyDent1.price);
        System.out.println("Rating:" + happyDent1.rating);

        System.out.println("Ingredients:");
        for(int index = 0; index < happyDent1.ingredients.length; index++)
        {
            System.out.println(happyDent1.ingredients[index]);
        }
        System.out.println("Available Cities:");
        for(int index = 0; index < happyDent1.availableCities.length; index++)
        {
            System.out.println(happyDent1.availableCities[index]);
        }
        System.out.println("-----------------");

        HappyDent happyDent2 = new HappyDent();
        happyDent2.name = "HappyDent Xylitol";
        happyDent2.brand = "Perfetti";
        happyDent2.flavor = "Strawberry";
        happyDent2.color = "Pink";
        happyDent2.price = 15;
        happyDent2.weight = 6;
        happyDent2.quantity = 1;
        happyDent2.shelfLife = 12;
        happyDent2.rating = 4;
        happyDent2.sugarFree = true;
        happyDent2.available = true;
        happyDent2.imported = false;
        happyDent2.safe = true;
        happyDent2.shape = "Square";
        happyDent2.packingType = "Bottle";
        happyDent2.manufactureDate = "02-01-2026";
        happyDent2.expiryDate = "02-01-2027";
        happyDent2.batchNumber = "HD789";
        happyDent2.licenseNumber = "LIC999";
        happyDent2.distributor = "ABC Suppliers";
        happyDent2.category = "Chewing Gum";
        happyDent2.targetAgeGroup = "All";
        happyDent2.texture = "Soft";
        happyDent2.usage = "Chew";
        happyDent2.certification = "FSSAI";
        happyDent2.storeLocation = "Reliance";
        happyDent2.barcode = "123456789";
        happyDent2.promoCode = "OFF20";
        happyDent2.ingredients = new String[]{"Xylitol", "Strawberry Flavor"};
        happyDent2.availableCities = new String[]{"Mumbai", "Delhi", "Pune"};

        System.out.println("HappyDent2 Details:");
        System.out.println("Name:" + happyDent2.name);
        System.out.println("Brand:" + happyDent2.brand);
        System.out.println("Flavor:" + happyDent2.flavor);
        System.out.println("Price:" + happyDent2.price);
        System.out.println("Rating:" + happyDent2.rating);

        System.out.println("Ingredients:");
        for(int index = 0; index < happyDent2.ingredients.length; index++)
        {
            System.out.println(happyDent2.ingredients[index]);
        }
        System.out.println("Available Cities:");
        for(int index = 0; index < happyDent2.availableCities.length; index++)
        {
            System.out.println(happyDent2.availableCities[index]);
        }
        System.out.println("-----------------");
    }
}