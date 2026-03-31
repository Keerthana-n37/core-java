class Smartphone extends Electronics 
{
    String os;
    int cameraMP;

    Smartphone()
	{
        super();
        System.out.println("Smartphone constructor called");
    }

    void makeCall()
	{
        System.out.println("Making a phone call");
    }

    void takePhoto() 
	{
        System.out.println("Taking photo");
    }

    void displaySmartphone()
	{
        System.out.println("OS: " + os);
        System.out.println("Camera: " + cameraMP);
    }
}