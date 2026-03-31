class MobileChromeBrowser extends Browser
 {

    boolean dataSaver;
    int tabsOpen;

    MobileChromeBrowser() 
	{
        System.out.println("Running MobileChromeBrowser constructor");
    }

    void offline()
	{
        System.out.println("Executing offline mode in MobileChromeBrowser");
        System.out.println("Data Saver: " + dataSaver);
        System.out.println("Tabs Open: " + tabsOpen);
    }

    void downloadPage() 
	{
        System.out.println("Downloading page for offline use");
    }
}