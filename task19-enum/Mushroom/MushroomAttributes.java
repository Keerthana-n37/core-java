class MushroomAttributes
{
    String color;
    String freshnessLevel;
    String origin;

    MushroomAttributes(String color,String freshnessLevel,String origin)
	{
        this.color = color;
        this.freshnessLevel = freshnessLevel;
        this.origin = origin;
    }

    void showAttributes() 
	{
        System.out.println("Color: " + this.color);
        System.out.println("Freshness Level: " + this.freshnessLevel);
        System.out.println("Origin: " + this.origin);
    }
}