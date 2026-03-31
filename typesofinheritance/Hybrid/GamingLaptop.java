class GamingLaptop extends Laptop 
{
    boolean hasRGBKeyboard;
    String gpu;

    GamingLaptop() 
	{
        super();
        System.out.println("GamingLaptop constructor called");
    }

    void playGame() 
	{
        System.out.println("Playing high-end games");
    }

    void displayGamingLaptop() 
	{
        System.out.println("RGB Keyboard: " + hasRGBKeyboard);
        System.out.println("GPU: " + gpu);
    }
}