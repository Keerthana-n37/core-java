class Mobile {
    static void turnOn(String name) {
        System.out.println("Turning on " + name);
    }
    static void makeCall(String name) {
        System.out.println("Making call using " + name);
		turnOn(name);
    }
    static void chargePhone(String name) {
        System.out.println("Charging " + name);
		turnOff(name);
    }
    static void turnOff(String name) {
        System.out.println("Turning off " + name);
    }
}
