class BridgeRunner {

    public static void main(String[] args) {

        Bridge bridge1 = new Bridge();
        bridge1.construct();
        bridge1.openBridge();
        bridge1.closeBridge();
        bridge1.allowVehicles();
        bridge1.allowPedestrians();
        bridge1.inspect();
        bridge1.repair();
        bridge1.clean();
        bridge1.paint();
        bridge1.lightUp();
        bridge1.withstandWind();
        bridge1.withstandEarthquake();
        bridge1.collectToll();
        bridge1.monitorTraffic();
        bridge1.supportWeight();
        System.out.println("----------------------");
        
		Bridge bridge2 = new Bridge();
        bridge2.construct();
        bridge2.openBridge();
        bridge2.closeBridge();
        bridge2.allowVehicles();
        bridge2.allowPedestrians();
        bridge2.inspect();
        bridge2.repair();
        bridge2.clean();
        bridge2.paint();
        bridge2.lightUp();
        bridge2.withstandWind();
        bridge2.withstandEarthquake();
        bridge2.collectToll();
        bridge2.monitorTraffic();
        bridge2.supportWeight();
        System.out.println("----------------------");

        Bridge.bridgeType();
        Bridge.material();
        Bridge.length();
        Bridge.yearBuilt();
        Bridge.location();
    }
}