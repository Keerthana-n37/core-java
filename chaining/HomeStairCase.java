class HomeStairCase extends StairCase
{
    String color;
    boolean handRail;

    HomeStairCase(String material, String location,String color, boolean handRail)
    {
        super(12, material, location);
        this.color = color;
        this.handRail = handRail;
		System.out.println("Constructor 1 called:customize steps");
    }
	
	HomeStairCase(int steps, String material, String location,String color, boolean handRail)
    {
        super(steps, material, location);
        this.color = color;
        this.handRail = handRail;
        System.out.println("Constructor 2 called: Full staircase details");
    }

    HomeStairCase(int steps, String location,String color, boolean handRail)
    {
        super(steps, "Concrete", location);
        this.color = color;
        this.handRail = handRail;
        System.out.println("Constructor 3 called: Customize steps and location");
    }

    void display()
    {
        System.out.println("Steps: " + super.steps);
        System.out.println("Material: " + super.material);
        System.out.println("Location: " + super.location);
        System.out.println("Color: " + this.color);
        System.out.println("Hand Rail Available: " + this.handRail);
        System.out.println("----------------------");
    }
}