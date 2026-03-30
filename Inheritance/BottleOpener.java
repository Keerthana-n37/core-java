class BottleOpener extends Opener 
{
    boolean hasCorkScrew;
    String color;
    int warranty; 
    boolean portable;
    String handleType;

    BottleOpener() 
	{
        super();
        System.out.println("BottleOpener constructor called...");
    }

    void twistCap() 
	{
        System.out.println("Twisting cap with " + brand);
    }

    void sharpenEdge() 
	{
        System.out.println("Sharpening edge of " + brand);
    }
}