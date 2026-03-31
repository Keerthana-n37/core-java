class Media 
{
    String mediaName;
    String category;
    int viewers;
    boolean online;

    Media() 
	{
        System.out.println("Media constructor called...");
    }

    void broadcast() 
	{
        System.out.println("Broadcasting media...");
    }

    void stopBroadcast() 
	{
        System.out.println("Stopping broadcast...");
    }
}