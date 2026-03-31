class WaterSlide extends Slide 
{
    boolean waterFlow;
    int speedLevel;
    String color;
    boolean curved;
    int capacity;

    WaterSlide() 
	{
        super();
        System.out.println("WaterSlide constructor called...");
    }

    void splashWater() 
	{
        System.out.println("Water splash activated...");
    }

    void increaseSpeed()
	{
        System.out.println("Speed increased...");
    }
}