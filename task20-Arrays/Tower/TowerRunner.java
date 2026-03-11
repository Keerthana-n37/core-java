class TowerRunner
{
    public static void main(String[] args)
    {
        int[] totalRooms = {10, 12, 8, 15, 9};

        Security[] securities = new Security[5];
        securities[0] = new Security("John", 8);
        securities[1] = new Security("Mikel", 6);
        securities[2] = new Security("Sharath", 7);
        securities[3] = new Security("Eshwar", 8);
        securities[4] = new Security("David", 9);

        Tower tower = new Tower(totalRooms, securities);
        tower.display();
    }
}