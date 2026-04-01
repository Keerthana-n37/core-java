class FarmChicken extends Chicken
{
    String color;
    int age;

    FarmChicken(String color, int age)
    {
        super("Broiler", 2.5, "Village Farm");
        this.color = color;
        this.age = age;
        System.out.println("Constructor 1 called: Default chicken created");
    }

    FarmChicken(String type, double weight, String farmLocation,String color, int age)
    {
        super(type, weight, farmLocation);
        this.color = color;
        this.age = age;
        System.out.println("Constructor 2 called: Full chicken details");
    }

    FarmChicken(double weight, String farmLocation, String color, int age)
    {
        super("Country Chicken", weight, farmLocation);
        this.color = color;
        this.age = age;
        System.out.println("Constructor 3 called: Customized weight and farm");
    }

    void display()
    {
        System.out.println("Chicken Type: " + super.type);
        System.out.println("Weight: " + super.weight);
        System.out.println("Farm Location: " + super.farmLocation);
        System.out.println("Color: " + this.color);
        System.out.println("Age (months): " + this.age);
        System.out.println("----------------------");
    }
}