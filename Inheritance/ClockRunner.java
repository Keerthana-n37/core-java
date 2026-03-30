class ClockRunner
{

    public static void main(String[] args) {

        System.out.println("Subclass Object Same Type");

        SmartClock clock = new SmartClock();
        clock.brandName = "Titan";
        clock.displayType = "Digital";
        clock.cost = 2500;
        clock.modelName = "T100";
        clock.bluetoothSupport = true;
        clock.batteryBackup = 12;
        clock.strapColor = "Black";
        clock.touchScreen = true;

        System.out.println("Brand : " + clock.brandName);
        System.out.println("Display Type : " + clock.displayType);
        System.out.println("Cost : " + clock.cost);
        System.out.println("Model Name : " + clock.modelName);
        System.out.println("Bluetooth Support : " + clock.bluetoothSupport);
        System.out.println("Battery Backup : " + clock.batteryBackup);
        System.out.println("Strap Color : " + clock.strapColor);
        System.out.println("Touch Screen : " + clock.touchScreen);
        clock.showTime();
        clock.ringAlarm();
        clock.syncMobile();


        SmartClock clock1 = new SmartClock();
        clock1.brandName = "Fastrack";
        clock1.displayType = "LED";
        clock1.cost = 3200;
        clock1.modelName = "F200";
        clock1.bluetoothSupport = false;
        clock1.batteryBackup = 10;
        clock1.strapColor = "Blue";
        clock1.touchScreen = false;

        System.out.println("Brand : " + clock1.brandName);
        System.out.println("Display Type : " + clock1.displayType);
        System.out.println("Cost : " + clock1.cost);
        System.out.println("Model Name : " + clock1.modelName);
        System.out.println("Bluetooth Support : " + clock1.bluetoothSupport);
        System.out.println("Battery Backup : " + clock1.batteryBackup);
        System.out.println("Strap Color : " + clock1.strapColor);
        System.out.println("Touch Screen : " + clock1.touchScreen);
        clock1.showTime();
        clock1.ringAlarm();
        clock1.syncMobile();


        System.out.println("Parent Reference Subclass Object");

        Clock basicClock = new SmartClock();
        basicClock.brandName = "Casio";
        basicClock.displayType = "Digital";
        basicClock.cost = 1800;

        System.out.println("Brand : " + basicClock.brandName);
        System.out.println("Display Type : " + basicClock.displayType);
        System.out.println("Cost : " + basicClock.cost);
        basicClock.showTime();
        basicClock.ringAlarm();

        Clock basicClock1 = new SmartClock();
        basicClock1.brandName = "Boat";
        basicClock1.displayType = "Smart";
        basicClock1.cost = 2700;

        System.out.println("Brand : " + basicClock1.brandName);
        System.out.println("Display Type : " + basicClock1.displayType);
        System.out.println("Cost : " + basicClock1.cost);
        basicClock1.showTime();
        basicClock1.ringAlarm();


        System.out.println("Parent Class Object");

        Clock wallClock = new Clock();
        wallClock.brandName = "Ajanta";
        wallClock.displayType = "Wall";
        wallClock.cost = 900;

        System.out.println("Brand : " + wallClock.brandName);
        System.out.println("Display Type : " + wallClock.displayType);
        System.out.println("Cost : " + wallClock.cost);
        wallClock.showTime();
        wallClock.ringAlarm();

        Clock wallClock1 = new Clock();
        wallClock1.brandName = "LocalBrand";
        wallClock1.displayType = "Analog";
        wallClock1.cost = 700;

        System.out.println("Brand : " + wallClock1.brandName);
        System.out.println("Display Type : " + wallClock1.displayType);
        System.out.println("Cost : " + wallClock1.cost);
        wallClock1.showTime();
        wallClock1.ringAlarm();
    }
}