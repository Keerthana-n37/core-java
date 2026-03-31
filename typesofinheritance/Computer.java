class Computer
 {

    String brand;
    int ram;
    double price;

    Computer() 
	{
        System.out.println("Running Computer constructor");
    }

    void install(Browser browser) 
	{
        System.out.println("Executing install in Computer");

        if (browser != null) 
		{
            browser.open();

            if (browser instanceof ChromBrowser) 
			{
                ChromBrowser chrome = (ChromBrowser) browser;
                chrome.fastOpen();
                chrome.updateBrowser();
            }

            if (browser instanceof MobileChromeBrowser) 
			{
                MobileChromeBrowser mobile = (MobileChromeBrowser) browser;
                mobile.offline();
                mobile.downloadPage();
            }
        }
    }

    void showComputerDetails() {
        System.out.println("Computer Brand: " + brand);
        System.out.println("RAM: " + ram);
        System.out.println("Price: " + price);
    }
}