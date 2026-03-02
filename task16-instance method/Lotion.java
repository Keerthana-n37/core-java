class Lotion {

    int lotionId;
    String brandName;
    String variant;
    double price;
    int quantity; 
    String skinType;
    boolean moisturizing;
    boolean medicated;
    String fragrance;
    String color;
    double phLevel;
    String manufacturer;
    String country;
    boolean crueltyFree;
    String packagingType;
    String expiryDate;
    String mainIngredient;
    boolean organic;
    double rating;
    String usageType;

    Lotion(int lotionId, String brandName, String variant, double price,
           int quantity, String skinType, boolean moisturizing,
           boolean medicated, String fragrance, String color,
           double phLevel, String manufacturer, String country,
           boolean crueltyFree, String packagingType, String expiryDate,
           String mainIngredient, boolean organic, double rating,
           String usageType) {

        this.lotionId = lotionId;
        this.brandName = brandName;
        this.variant = variant;
        this.price = price;
        this.quantity = quantity;
        this.skinType = skinType;
        this.moisturizing = moisturizing;
        this.medicated = medicated;
        this.fragrance = fragrance;
        this.color = color;
        this.phLevel = phLevel;
        this.manufacturer = manufacturer;
        this.country = country;
        this.crueltyFree = crueltyFree;
        this.packagingType = packagingType;
        this.expiryDate = expiryDate;
        this.mainIngredient = mainIngredient;
        this.organic = organic;
        this.rating = rating;
        this.usageType = usageType;
    }

    void aboutLotion() {

        System.out.println("Lotion ID: " + lotionId);
        System.out.println("Brand Name: " + brandName);
        System.out.println("Variant: " + variant);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Skin Type: " + skinType);
        System.out.println("Moisturizing: " + moisturizing);
        System.out.println("Medicated: " + medicated);
        System.out.println("Fragrance: " + fragrance);
        System.out.println("Color: " + color);
        System.out.println("pH Level: " + phLevel);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Country: " + country);
        System.out.println("Cruelty Free: " + crueltyFree);
        System.out.println("Packaging Type: " + packagingType);
        System.out.println("Expiry Date: " + expiryDate);
        System.out.println("Main Ingredient: " + mainIngredient);
        System.out.println("Organic: " + organic);
        System.out.println("Rating: " + rating);
        System.out.println("Usage Type: " + usageType);
        System.out.println("----------------------------");
    }
}