class StairCaseRunner
{
    public static void main(String[] args)
    {
        System.out.println("Staircase 1");
        HomeStairCase stair1 = new HomeStairCase("Wood","Home","Brown",true);
        stair1.display();

        System.out.println("Staircase 2");
        HomeStairCase stair2 = new HomeStairCase(20,"Marble","Duplex House","White",true);
        stair2.display();

        System.out.println("Staircase 3");
        HomeStairCase stair3 = new HomeStairCase(15,"Office","Gray",false);
        stair3.display();
    }
}