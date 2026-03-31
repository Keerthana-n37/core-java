class ElectronicsRunner 
{
    public static void main(String[] args)
	{

        System.out.println("Hybrid Inheritance Example");

        GamingLaptop gamingl = new GamingLaptop();
        gamingl.brand = "Alienware";
        gamingl.price = 250000;
        gamingl.warranty = true;
        gamingl.ram = 32;
        gamingl.storage = 1000;
        gamingl.hasRGBKeyboard = true;
        gamingl.gpu = "NVIDIA RTX 3080";

        System.out.println("Gaming Laptop Details");
        gamingl.displayElectronics();
        gamingl.displayLaptop();
        gamingl.displayGamingLaptop();
        gamingl.powerOn();
        gamingl.compileCode();
        gamingl.playGame();
        gamingl.powerOff();

        System.out.println("Smartphone Details");
        Smartphone phone = new Smartphone();
        phone.brand = "Apple";
        phone.price = 120000;
        phone.warranty = true;
        phone.os = "iOS";
        phone.cameraMP = 48;

        phone.displayElectronics();
        phone.displaySmartphone();
        phone.powerOn();
        phone.makeCall();
        phone.takePhoto();
        phone.powerOff();
    }
}