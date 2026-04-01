class StageRunner
{
    public static void main(String[] args)
    {
        System.out.println("Stage Object 1");
        EventStage stage1 = new EventStage(true, 2);
        System.out.println("Stage Name: " + stage1.stageName);
        System.out.println("Capacity: " + stage1.audienceCapacity);
        System.out.println("Location: " + stage1.location);
        System.out.println("Sound System: " + stage1.soundSystemAvailable);
        System.out.println("Screens: " + stage1.numberOfScreens);

        System.out.println();

        System.out.println("Stage Object 2");
        EventStage stage2 = new EventStage("Concert Stage", 6000, "Hyderabad", true, 4);
        System.out.println("Stage Name: " + stage2.stageName);
        System.out.println("Capacity: " + stage2.audienceCapacity);
        System.out.println("Location: " + stage2.location);
        System.out.println("Sound System: " + stage2.soundSystemAvailable);
        System.out.println("Screens: " + stage2.numberOfScreens);

        System.out.println();

        System.out.println("Stage Object 3 ");
        EventStage stage3 = new EventStage(3500, false, 1);
        System.out.println("Stage Name: " + stage3.stageName);
        System.out.println("Capacity: " + stage3.audienceCapacity);
        System.out.println("Location: " + stage3.location);
        System.out.println("Sound System: " + stage3.soundSystemAvailable);
        System.out.println("Screens: " + stage3.numberOfScreens);
    }
}