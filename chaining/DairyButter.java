class DairyButter extends Butter
{
    String flavor;
    int quantity;

    DairyButter(String flavor, int quantity)
    {
        super("Amul", 50, "Salted");
        this.flavor = flavor;
        this.quantity = quantity;
        System.out.println("Constructor 1 called: Default butter created");
    }

    DairyButter(String brand, double price, String type,String flavor, int quantity)
    {
        super(brand, price, type);
        this.flavor = flavor;
        this.quantity = quantity;
        System.out.println("Constructor 2 called: Full butter details");
    }

    DairyButter(double price, String type,String flavor, int quantity)
    {
        super("Nandini", price, type);
        this.flavor = flavor;
        this.quantity = quantity;
        System.out.println("Constructor 3 called: Customized price and type");
    }

    void display()
    {
        System.out.println("Brand: " + super.brand);
        System.out.println("Price: " + super.price);
        System.out.println("Type: " + super.type);
        System.out.println("Flavor: " + this.flavor);
        System.out.println("Quantity: " + this.quantity);
        System.out.println("----------------------");
    }
}