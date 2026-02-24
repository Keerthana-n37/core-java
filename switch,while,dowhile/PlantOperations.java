class PlantOperations {
    public static void main(String[] args) {
        int day = 1;
		int trim = 2;
        while (day <= 5) {
            Plant.waterPlant("Rose");
            day++;
        }
		while (day <= 3) {
            Plant.giveSunlight("Rose");
            day++;
        }
        do {
            Plant.trimLeaves("Rose");
            trim--;
        } while (trim > 0);
    }
}
