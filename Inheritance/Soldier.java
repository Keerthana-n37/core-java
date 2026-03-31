class Soldier 
{
    String name;
    String rank;
    int experience;
    boolean active;

    Soldier() 
	{
        System.out.println("Soldier constructor called...");
    }

    void patrol() 
	{
        System.out.println("Soldier patrolling...");
    }

    void rest() 
	{
        System.out.println("Soldier resting...");
    }
}