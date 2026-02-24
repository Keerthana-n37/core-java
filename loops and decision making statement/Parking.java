class Parking{
    public static void main(String[] args){
        int vehicles = 8;
        manageParking(vehicles);
    }
    static void manageParking(int vehicles){
        checkAvailability(vehicles);
        assignSlots(vehicles);
        if (vehicles > 0){
            calculateCharges(vehicles);
        }
        closeParking(vehicles);
    }
    static void checkAvailability(int vehicles){
        if (vehicles == 0) {
            print("Parking Empty");
        } else if (vehicles < 5) {
            print("Slots Available");
        } else {
            print("Parking Almost Full");
        }

        if (vehicles > 7) {
            print("No More Entry Allowed");
        }
    }
    static void assignSlots(int vehicles){
        switch (vehicles % 3) {
            case 0:
                print("Basement Slot");
                break;
            case 1:
                print("Ground Floor Slot");
                break;
            default:
                print("Terrace Slot");
        }
        for (int i = 1; i <= 3; i++){
            print("Assigning Slot " + i);
        }
    }

    static void calculateCharges(int vehicles){
        int hours = 2;
        while (hours > 0) {
            print("Calculating Charges for Hour " + hours);
            hours--;
        }
        do {
            print("Generating Receipt");
            vehicles--;
        } while (vehicles > 6);
    }

    static void closeParking(int vehicles){
        if (vehicles > 5) {
            if (vehicles > 7) {
                print("Security Alert Activated");
            }
        }
    }

    static void print(String msg){
        System.out.println(msg);
    }
}
