class Car {
    static void startEngine(String carName) {
        System.out.println("Starting engine of " + carName);
        checkFuel(carName);
    }
    static void checkFuel(String carName) {
        System.out.println("Checking fuel in " + carName);
    }
    static void driveCar(String carName) {
        System.out.println("Driving " + carName);
    }
    static void stopCar(String carName) {
        System.out.println("Stopping " + carName);
        turnOffEngine(carName);
    }
    static void turnOffEngine(String carName) {
        System.out.println("Turning off engine of " + carName);
    }
    static void parkCar(String carName) {
        System.out.println("Parking " + carName);
    }
}
