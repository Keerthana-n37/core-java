class EventStage extends Stage
{
    boolean soundSystemAvailable;
    int numberOfScreens;

    EventStage(boolean soundSystemAvailable, int numberOfScreens)
    {
        super("Main Stage", 4000, "Bangalore");
        this.soundSystemAvailable = soundSystemAvailable;
        this.numberOfScreens = numberOfScreens;
        System.out.println("Constructor 1: Default stage created");
    }

    EventStage(String stageName, int audienceCapacity, String location, boolean soundSystemAvailable, int numberOfScreens)
    {
        super(stageName, audienceCapacity, location);
        this.soundSystemAvailable = soundSystemAvailable;
        this.numberOfScreens = numberOfScreens;
        System.out.println("Constructor 2: Custom stage created");
    }

    EventStage(int audienceCapacity, boolean soundSystemAvailable, int numberOfScreens)
    {
        super("Open Air Stage", audienceCapacity, "Mysore");
        this.soundSystemAvailable = soundSystemAvailable;
        this.numberOfScreens = numberOfScreens;
        System.out.println("Constructor 3: Capacity customized");
    }
}