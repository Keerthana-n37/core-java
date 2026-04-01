class OceanBlueWhale extends BlueWhale
{
    String habitat;
    int age;

    OceanBlueWhale(String habitat, int age)
    {
        super("Blue Whale",30.0,150);
        this.habitat = habitat;
        this.age = age;
        System.out.println("Constructor OceanBlueWhale called: Default whale details");
    }

    OceanBlueWhale(String name, double length, double weight,String habitat, int age)
    {
        super(name, length, weight);
        this.habitat = habitat;
        this.age = age;
        System.out.println("Constructor OceanBlueWhale called: Full whale details");
    }

    OceanBlueWhale(double length, double weight, String habitat, int age)
    {
        super("Blue Whale", length, weight);
        this.habitat = habitat;
        this.age = age;
        System.out.println("Constructor OceanBlueWhale called: Custom length and weight");
    }

    void display()
    {
        System.out.println("Name: " + super.name);
        System.out.println("Length: " + super.length);
        System.out.println("Weight: " + super.weight);
        System.out.println("Habitat: " + this.habitat);
        System.out.println("Age: " + this.age);
        System.out.println("----------------------");
    }
}