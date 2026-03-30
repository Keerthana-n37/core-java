class PowerBank 
{
    String brandName;
    int capacity;
    int cost;

    PowerBank()
	{
        System.out.println("PowerBank constructor...");
    }

    void charge() 
	{
        System.out.println("PowerBank is charging device...");
    }

    void showStatus() 
	{
        System.out.println("PowerBank showing battery status...");
    }
}