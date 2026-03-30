class Bar 
{
    String name;
    String location;
    int capacity;
    boolean open24Hours;

    Bar() 
	{
        System.out.println("Bar constructor called...");
    }

    void serveDrinks() 
	{
        System.out.println(name + " is serving drinks.");
    }

    void closeBar() 
	{
        System.out.println(name + " is closing now.");
    }
}