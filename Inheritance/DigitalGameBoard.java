class DigitalGameBoard extends GameBoard
{
    boolean onlineMode;
    int batteryLife;
    String displayType;
    int numberOfLevels;
    boolean soundEnabled;

    DigitalGameBoard()
	{
        super();
        System.out.println("DigitalGameBoard constructor...");
    }

    void connectToInternet() 
	{
        System.out.println("DigitalGameBoard is connecting to the internet...");
    }

    void updateFirmware() 
	{
        System.out.println("DigitalGameBoard firmware updated successfully...");
    }
}