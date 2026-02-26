class RainRunner
{
    public static void main(String[] args)
    {
        Rain rain1 = new Rain();
        System.out.println("----------------");

        Rain rain2 = new Rain("Heavy", "Bangalore");
        System.out.println("Rain type: " + rain2.type);
        System.out.println("Rain location: " + rain2.location);
        System.out.println("----------------");

        Rain rain3 = new Rain(75.5, 60);
        System.out.println("Rain intensity: " + rain3.intensity);
        System.out.println("Rain duration: " + rain3.duration);
        System.out.println("----------------");

        Rain rain4 = new Rain("Monsoon", 80.0, "Moderate");
        System.out.println("Rain season: " + rain4.season);
        System.out.println("Rain intensity: " + rain4.intensity);
        System.out.println("Rain type: " + rain4.type);
        System.out.println("----------------");

        Rain rain5 = new Rain("Drizzle", "Winter", 30);
        System.out.println("Rain type: " + rain5.type);
        System.out.println("Rain season: " + rain5.season);
        System.out.println("Rain duration: " + rain5.duration);
        System.out.println("----------------");

        Rain rain6 = new Rain("Heavy", 90.5, "Monsoon", "Chennai", 120);
        System.out.println("Rain type: " + rain6.type);
        System.out.println("Rain intensity: " + rain6.intensity);
        System.out.println("Rain season: " + rain6.season);
        System.out.println("Rain location: " + rain6.location);
        System.out.println("Rain duration: " + rain6.duration);
    }
}