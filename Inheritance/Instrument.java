class Instrument 
{
    String instrumentName;
    String type;
    int price;
    boolean portable;

    Instrument() 
	{
        System.out.println("Instrument constructor called...");
    }

    void play() 
	{
        System.out.println("Playing instrument...");
    }

    void stop() 
	{
        System.out.println("Stopping music...");
    }
}