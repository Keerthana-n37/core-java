class CarOperations {

    public static void main(String[] args) {
        String name="Toyota";
        int trip = 1;
		int stop = 3;
        while (trip <= 3) { 
            Car.startEngine(name);
            Car.driveCar(name);
            trip++;
        }
		while(trip=2){
			Car.startEngine(name);
		}
        do {
            Car.stopCar(name);
            Car.parkCar(name);
            stop--;
        } while (stop <1); 
		do{
			Car.parkCar(name);
			stop++;
		}while(stop<1);
    }
}
