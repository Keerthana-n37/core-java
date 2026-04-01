class BlueWhaleRunner 
{
    public static void main(String[] args) 
	{

        OceanBlueWhale whale1 = new OceanBlueWhale("Pacific Ocean", 25);
        whale1.display();

        OceanBlueWhale whale2 = new OceanBlueWhale("Blue Whale", 32.5, 160.0, "Atlantic Ocean", 28);
        whale2.display();

        OceanBlueWhale whale3 = new OceanBlueWhale(28.0, 155.0, "Indian Ocean", 22);
        whale3.display();
    }
}