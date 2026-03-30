class UltraPowerBank extends PowerBank 
{

    int outputPorts;
    boolean fastCharging;
    String color;
    int weight;
    boolean wirelessCharging;

    UltraPowerBank()
	{
        super();
        System.out.println("UltraPowerBank constructor...");
    }

    void activateWirelessCharge()
	{
        System.out.println("Executing activateWirelessCharge in UltraPowerBank...");
    }
}