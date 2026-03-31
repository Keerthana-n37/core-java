class ElectricInstrument extends Instrument 
{
    String brand;
    int power;
    boolean amplifier;
    int strings;
    String soundType;

    ElectricInstrument() 
	{
        super();
        System.out.println("ElectricInstrument constructor called...");
    }

    void connectPower() 
	{
        System.out.println("Connecting power...");
    }

    void adjustSound()
	{
        System.out.println("Adjusting sound...");
    }
}
