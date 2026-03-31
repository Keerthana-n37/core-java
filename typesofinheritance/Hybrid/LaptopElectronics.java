class LaptopElectronics extends Electronics 
{
    int ram;      
    int storage;  

    Laptop()
	{
        super();
        System.out.println("Laptop constructor called");
    }

    void compileCode() 
	{
        System.out.println("Laptop compiling code");
    }

    void displayLaptop() 
	{
        System.out.println("RAM: " + ram);
        System.out.println("Storage: " + storage);
    }
}