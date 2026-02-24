class Ticket{

    public static void main(String[] args) {
        processBooking(3, 2);
    }

    static void processBooking(int seats, int ticketType) {
        if (seats <= 0) {
            print("No Seats Selected");
            return;
        }
        checkSeatLimit(seats);
        int totalAmount = calculateAmount(seats, ticketType);
        print("Total Amount: " + totalAmount);
        confirmBooking(seats);
    }
	
    static void checkSeatLimit(int seats) {
        if (seats > 5) {
            print("Group Booking");
        } else if (seats > 2) {
            print("Family Booking");
        } else {
            print("Individual Booking");
        }
        for (int i = 1; i <= seats; i++) {
            if (i % 2 == 0) {
                print("Assigning Window Seat " + i);
            } else {
                print("Assigning Regular Seat " + i);
            }
        }
    }

    static int calculateAmount(int seats, int type) {

        int pricePerSeat = 0;
		int total = 0;
        int count = seats;

        switch (type) {
            case 1:
                pricePerSeat = 100;
                break;
            case 2:
                pricePerSeat = 150;
                break;
            default:
                pricePerSeat = 200;
        }
        while (count > 0) {
            total += pricePerSeat;
            count--;
        }

        return total;
    }

    static void confirmBooking(int seats) {
      int attempt = 1;
        if (seats > 0) {
            if (seats >= 3) {
                print("Snacks Coupon Applied");
            }
        }
        do {
            print("Sending Confirmation SMS - Attempt " + attempt);
            attempt++;
        } while (attempt <= 2);
    }

    static void print(String msg) {
        System.out.println(msg);
    }
}
