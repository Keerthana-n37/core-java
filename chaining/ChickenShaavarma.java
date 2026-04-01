class ChickenShaavarma extends Shaavarma
{
    String sauceType;
    boolean extraCheese;

    ChickenShaavarma(String sauceType, boolean extraCheese)
    {
        super("Arabian Bites", "Medium", 120);
        this.sauceType = sauceType;
        this.extraCheese = extraCheese;
        System.out.println("Constructor 1: Default shaavarma order");
    }

    ChickenShaavarma(String shopName, String size, double price,String sauceType, boolean extraCheese)
    {
        super(shopName, size, price);
        this.sauceType = sauceType;
        this.extraCheese = extraCheese;
        System.out.println("Constructor 2: Full shaavarma details");
    }

    ChickenShaavarma(String size, double price,String sauceType, boolean extraCheese)
    {
        super("Street Shawarma", size, price);
        this.sauceType = sauceType;
        this.extraCheese = extraCheese;
        System.out.println("Constructor 3: Custom size and price");
    }

    void display()
    {
        System.out.println("Shop Name: " + super.shopName);
        System.out.println("Size: " + super.size);
        System.out.println("Price: " + super.price);
        System.out.println("Sauce Type: " + this.sauceType);
        System.out.println("Extra Cheese: " + this.extraCheese);
        System.out.println("----------------------");
    }
}