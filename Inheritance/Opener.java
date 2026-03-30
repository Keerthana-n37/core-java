class Opener
{
    String brand;
    String material;
    boolean isManual;
    double length; 

    Opener() 
	{
        System.out.println("Opener constructor called...");
    }

    void open() 
	{
        System.out.println(brand + " opener is being used.");
    }

    void clean() 
	{
        System.out.println(brand + " opener is cleaned.");
    }
}