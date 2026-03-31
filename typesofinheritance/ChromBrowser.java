class ChromBrowser extends Browser 
{
    String developer;
    boolean syncSupport;

    ChromBrowser()
	{
        System.out.println("Running ChromBrowser constructor");
    }

    void fastOpen()
	{
        System.out.println("Executing fastOpen in ChromBrowser");
        System.out.println("Developer: " + developer);
        System.out.println("Sync Support: " + syncSupport);
    }

    void updateBrowser() 
	{
        System.out.println("Updating Chrome Browser");
    }
}