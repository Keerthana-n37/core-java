class BatteryRunner {
    public static void main(String[] args) {

        Battery battery1 = new Battery();
        System.out.println("-------------------------");

        Battery battery2 = new Battery("Duracell", 12.0);
        System.out.println("Battery2 Brand: " + battery2.brand);
        System.out.println("Battery2 Voltage: " + battery2.voltage);
        System.out.println("-------------------------");

        Battery battery3 = new Battery(5000, 1200.0);
        System.out.println("Battery3 Capacity: " + battery3.capacity);
        System.out.println("Battery3 Price: " + battery3.price);
        System.out.println("-------------------------");

        Battery battery4 = new Battery("Lithium", 6000, 9.5);
        System.out.println("Battery4 Type: " + battery4.type);
        System.out.println("Battery4 Capacity: " + battery4.capacity);
        System.out.println("Battery4 Voltage: " + battery4.voltage);
        System.out.println("-------------------------");

        Battery battery5 = new Battery("Exide", 7500, "Lead Acid", 12.5, 2500.0);
        System.out.println("Battery5 Brand: " + battery5.brand);
        System.out.println("Battery5 Capacity: " + battery5.capacity);
        System.out.println("Battery5 Type: " + battery5.type);
        System.out.println("Battery5 Voltage: " + battery5.voltage);
        System.out.println("Battery5 Price: " + battery5.price);
        System.out.println("-------------------------");
		
		Battery battery6 = new Battery("Amaron", "Lithium", 1800.0);
        System.out.println("Brand: " + battery6.brand);
        System.out.println("Type: " + battery6.type);
        System.out.println("Price: " + battery6.price);
        System.out.println("-------------------------");
    }
}