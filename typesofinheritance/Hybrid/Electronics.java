class Electronics 
{
    String brand;
    double price;
    boolean warranty;

    Electronics() 
	{
        System.out.println("Electronics constructor called");
    }

    void powerOn() 
	{
        System.out.println("Electronics powering ON");
    }

    void powerOff() 
	{
        System.out.println("Electronics powering OFF");
    }

    void displayElectronics() 
	{
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Warranty: " + warranty);
    }
}