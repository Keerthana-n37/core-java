class OfficeBuilding extends Building
{
    int parkingCapacity;
    boolean liftAvailable;

    OfficeBuilding(int parkingCapacity, boolean liftAvailable)
    {
        super("Tech Park", 10, "Bangalore");
        this.parkingCapacity = parkingCapacity;
        this.liftAvailable = liftAvailable;
        System.out.println("Constructor 1 called: Default building created");
    }

    OfficeBuilding(String name, int floors, String location,int parkingCapacity, boolean liftAvailable)
    {
        super(name, floors, location);
        this.parkingCapacity = parkingCapacity;
        this.liftAvailable = liftAvailable;
        System.out.println("Constructor 2 called: Full building details");
    }

    OfficeBuilding(int floors, String location,int parkingCapacity, boolean liftAvailable)
    {
        super("Commercial Building", floors, location);
        this.parkingCapacity = parkingCapacity;
        this.liftAvailable = liftAvailable;
        System.out.println("Constructor 3 called: Custom floors and location");
    }

    void display()
    {
        System.out.println("Building Name: " + super.name);
        System.out.println("Floors: " + super.floors);
        System.out.println("Location: " + super.location);
        System.out.println("Parking Capacity: " + this.parkingCapacity);
        System.out.println("Lift Available: " + this.liftAvailable);
        System.out.println("----------------------");
    }
}