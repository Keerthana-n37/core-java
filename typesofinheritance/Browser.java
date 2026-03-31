class Browser 
{
    String name;
    int version;
    boolean secure;

    Browser() 
	{
        System.out.println("Running Browser constructor");
    }

    void open()
	{
        System.out.println("Executing open in Browser");
        System.out.println("Browser Name: " + name);
        System.out.println("Version: " + version);
        System.out.println("Secure: " + secure);
    }

    void close()
	{
        System.out.println("Executing close in Browser");
    }
}