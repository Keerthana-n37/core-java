public class BatteryRunner
{
    public static void main(String[] args) 
	{
        System.out.println("Voltage: " +BatteryType.AA.getVoltage());
        System.out.println("Size: " + BatteryType.AA.getSize());

        BatteryType.AA.display();
	}
}
		