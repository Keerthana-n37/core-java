class TrackRunner
{
    public static void main(String[] args)
    {
        Track track1 = new Track();
        System.out.println("----------------");

        Track track2 = new Track("Athletics", 8);
        System.out.println("Track type: " + track2.type);
        System.out.println("Track lanes: " + track2.lanes);
        System.out.println("----------------");

        Track track3 = new Track(400.0, "Synthetic");
        System.out.println("Track length: " + track3.length);
        System.out.println("Track surface: " + track3.surface);
        System.out.println("----------------");

        Track track4 = new Track("Olympic Stadium", "Athletics", 500.0);
        System.out.println("Track location: " + track4.location);
        System.out.println("Track type: " + track4.type);
        System.out.println("Track length: " + track4.length);
        System.out.println("----------------");

        Track track5 = new Track("Tartan", 6, 300.0);
        System.out.println("Track surface: " + track5.surface);
        System.out.println("Track lanes: " + track5.lanes);
        System.out.println("Track length: " + track5.length);
        System.out.println("----------------");

        Track track6 = new Track("Athletics", 500.0, "Olympic Stadium", "Synthetic", 8);
        System.out.println("Track type: " + track6.type);
        System.out.println("Track length: " + track6.length);
        System.out.println("Track location: " + track6.location);
        System.out.println("Track surface: " + track6.surface);
        System.out.println("Track lanes: " + track6.lanes);
    }
}