class BuildingRunner
{
    public static void main(String[] args)
    {
        System.out.println("Building 1 details");
        OfficeBuilding building1 = new OfficeBuilding(50, true);
        building1.display();

        System.out.println("Building 2 details");
        OfficeBuilding building2 =new OfficeBuilding("City Mall", 15, "Hyderabad", 120, true);
        building2.display();

        System.out.println("Building 3 details");
        OfficeBuilding building3 =new OfficeBuilding(8, "Mysore", 40, false);
        building3.display();
    }
}