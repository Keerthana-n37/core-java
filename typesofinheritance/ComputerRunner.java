class ComputerRunner 
{

    public static void main(String[] values)
	{

        Computer computer = new Computer();
        computer.brand = "Dell";
        computer.ram = 16;
        computer.price = 65000;
        computer.showComputerDetails();

        Browser browser = new Browser();
        browser.name = "Generic Browser";
        browser.version = 1;
        browser.secure = true;

        ChromBrowser chromeBrowser = new ChromBrowser();
        chromeBrowser.name = "Google Chrome";
        chromeBrowser.version = 120;
        chromeBrowser.secure = true;
        chromeBrowser.developer = "Google";
        chromeBrowser.syncSupport = true;

        MobileChromeBrowser mobileChromeBrowser = new MobileChromeBrowser();
        mobileChromeBrowser.name = "Chrome Mobile";
        mobileChromeBrowser.version = 115;
        mobileChromeBrowser.secure = true;
        mobileChromeBrowser.dataSaver = true;
        mobileChromeBrowser.tabsOpen = 5;

        System.out.println("Browser");
        computer.install(browser);

        System.out.println("Chrome Browser");
        computer.install(chromeBrowser);

        System.out.println("Mobile Chrome Browser");
        computer.install(mobileChromeBrowser);
    }
}