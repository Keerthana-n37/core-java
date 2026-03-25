class Salt
{
    String saltName;
    String originPlace;
    String color;
    int pricePerKg;
    boolean iodized;
    String usageType;

    Salt(String saltName,String originPlace,String color,int pricePerKg,boolean iodized,String usageType)
    {
        this.saltName = saltName;
        this.originPlace = originPlace;
        this.color = color;
        this.pricePerKg = pricePerKg;
        this.iodized = iodized;
        this.usageType = usageType;
    }

    void displaySaltDetails()
    {
        System.out.println("Executing displaySaltDetails in Salt");
        System.out.println("Salt Name: " +this.saltName);
        System.out.println("Origin Place: " +this.originPlace);
        System.out.println("Color: " +this.color);
        System.out.println("Price per Kg: " +this.pricePerKg);
        System.out.println("Is Iodized: " +this.iodized);
        System.out.println("Usage Type: " +this.usageType);
        System.out.println("-----------------------------");
    }
}