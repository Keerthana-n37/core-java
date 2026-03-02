class Shampoo {

    int shampooId;
    String brandName;
    String variant;
    double price;
    int quantity; 
    String hairType;
    boolean antiDandruff;
    boolean sulfateFree;
    String fragrance;
    String color;
    double phLevel;
    String manufacturer;
    String country;
    boolean crueltyFree;
    String packagingType;
    String expiryDate;
    String ingredient;
    boolean organic;
    double rating;
    String usageType;

    Shampoo(int shampooId, String brandName, String variant, double price,
            int quantity, String hairType, boolean antiDandruff,
            boolean sulfateFree, String fragrance, String color,
            double phLevel, String manufacturer, String country,
            boolean crueltyFree, String packagingType, String expiryDate,
            String ingredient, boolean organic, double rating,
            String usageType) {

        this.shampooId = shampooId;
        this.brandName = brandName;
        this.variant = variant;
        this.price = price;
        this.quantity = quantity;
        this.hairType = hairType;
        this.antiDandruff = antiDandruff;
        this.sulfateFree = sulfateFree;
        this.fragrance = fragrance;
        this.color = color;
        this.phLevel = phLevel;
        this.manufacturer = manufacturer;
        this.country = country;
        this.crueltyFree = crueltyFree;
        this.packagingType = packagingType;
        this.expiryDate = expiryDate;
        this.ingredient = ingredient;
        this.organic = organic;
        this.rating = rating;
        this.usageType = usageType;
    }

    void aboutShampoo() {

        System.out.println("Shampoo ID: " + shampooId);
        System.out.println("Brand Name: " + brandName);
        System.out.println("Variant: " + variant);
        System.out.println("Price: ₹" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Hair Type: " + hairType);
        System.out.println("Anti Dandruff: " + antiDandruff);
        System.out.println("Sulfate Free: " + sulfateFree);
        System.out.println("Fragrance: " + fragrance);
        System.out.println("Color: " + color);
        System.out.println("pH Level: " + phLevel);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Country: " + country);
        System.out.println("Cruelty Free: " + crueltyFree);
        System.out.println("Packaging Type: " + packagingType);
        System.out.println("Expiry Date: " + expiryDate);
        System.out.println("Main Ingredient: " + ingredient);
        System.out.println("Organic: " + organic);
        System.out.println("Rating: " + rating);
        System.out.println("Usage Type: " + usageType);
        System.out.println("----------------------------");
    }
}