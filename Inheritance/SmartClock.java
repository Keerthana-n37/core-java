class SmartClock extends Clock{

    String modelName;
    boolean bluetoothSupport;
    int batteryBackup;
    String strapColor;
    boolean touchScreen;

    SmartClock(){
        super();
        System.out.println("SmartClock constructor...");
    }

    void syncMobile(){
        System.out.println("executing syncMobile in SmartClock...");
    }
}