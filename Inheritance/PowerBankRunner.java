class PowerBankRunner 
{

    public static void main(String[] args)
	{

        System.out.println("Subclass Object Same Type");

        UltraPowerBank power = new UltraPowerBank();
        power.brandName = "Mi";
        power.capacity = 25000;
        power.cost = 2500;
        power.outputPorts = 3;
        power.fastCharging = true;
        power.color = "Silver";
        power.weight = 500;
        power.wirelessCharging = true;

        System.out.println("Brand : " + power.brandName);
        System.out.println("Capacity : " + power.capacity);
        System.out.println("Cost : " + power.cost);
        System.out.println("Output Ports : " + power.outputPorts);
        System.out.println("Fast Charging : " + power.fastCharging);
        System.out.println("Color : " + power.color);
        System.out.println("Weight : " + power.weight);
        System.out.println("Wireless Charging : " + power.wirelessCharging);
        power.charge();
        power.showStatus();
        power.activateWirelessCharge();


        System.out.println("Parent Reference Subclass Object");

        PowerBank basicPower = new UltraPowerBank();
        basicPower.brandName = "Boat";
        basicPower.capacity = 15000;
        basicPower.cost = 1800;

        System.out.println("Brand : " + basicPower.brandName);
        System.out.println("Capacity : " + basicPower.capacity);
        System.out.println("Cost : " + basicPower.cost);
        basicPower.charge();
        basicPower.showStatus();


        System.out.println("Parent Class Object");

        PowerBank normalPower = new PowerBank();
        normalPower.brandName = "Ambrane";
        normalPower.capacity = 10000;
        normalPower.cost = 1200;

        System.out.println("Brand : " + normalPower.brandName);
        System.out.println("Capacity : " + normalPower.capacity);
        System.out.println("Cost : " + normalPower.cost);
        normalPower.charge();
        normalPower.showStatus();
    }
}