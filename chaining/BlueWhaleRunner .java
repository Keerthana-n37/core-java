class BlueWhaleRunner 
{
    public static void main(String[] args) 
	{

        Whale whale1 = new Whale("Pacific Ocean", 25);
        whale1.displayInfo();

        Whale whale2 = new Whale("Blue Whale", 32.5, 160.0, "Atlantic Ocean", 28);
        whale2.displayInfo();

        Whale whale3 = new Whale(28.0, 155.0, "Indian Ocean", 22);
        whale3.displayInfo();
    }
}