class Factory
{
    String name;
    String location;
    int totalEmployees;
    boolean operational;

    Factory() 
	{
        System.out.println("Factory constructor called...");
    }

    void startProduction() 
	{
        System.out.println(name + " production started.");
    }

    void stopProduction() 
	{
        System.out.println(name + " production stopped.");
    }
}