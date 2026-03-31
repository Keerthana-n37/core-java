class SpecialSoldier extends Soldier 
{
    String mission;
    int weapons;
    boolean trained;
    int medals;
    String unit;

    SpecialSoldier() 
	{
        super();
        System.out.println("SpecialSoldier constructor called...");
    }

    void attack() 
	{
        System.out.println("Attack mission started...");
    }

    void rescue() 
	{
        System.out.println("Rescue mission started...");
    }
}