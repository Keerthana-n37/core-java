class PaymentSystem {

    public static void main(String[] args) {
        startPayment();
    }
    static void startPayment() {

        int amount = getAmount();
        int mode = getMode();

        validateAmount(amount);
        processMode(mode);

        verification();
        processing();
        retry();
    }
    static void validateAmount(int amount) {

        if (isValid(amount)) {
            System.out.println("Valid Amount");
        }

        if (isHigh(amount)) {
            System.out.println("High Transaction");
        } else {
            System.out.println("Normal Transaction");
        }
        checkCategory(amount);

        if (isValid(amount)) {
            if (isHigh(amount)) {
                System.out.println("Extra Verification Needed");
            }
        }
    }
    static void checkCategory(int amount) {
        if (amount > 10000) {
           System.out.println("Premium Transaction");
        } else if (amount > 3000) {
            System.out.println("Gold Transaction");
        } else {
            System.out.println("Regular Transaction");
        }
    }
    static void processMode(int mode) {
        switch (mode) {
            case 1:
                System.out.println("Credit Card");
                break;
            case 2:
               System.out.println("UPI");
                break;
            default:
                System.out.println("Cash");
        }
    }
    static void verification() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Verification Step " + i);
        }
    }
    static void processing() {
        int i = 1;
        while (i <= 2) {
            System.out.println("Processing Step " + i);
            i++;
        }
    }
    static void retry() {
        int j = 1;
        do {
            System.out.println("Retry Attempt " + j);
            j++;
        } while (j <= 2);
    }
    static int getAmount(){
        return 5000;
    }
    static int getMode(){
        return 2;
    }
    static boolean isValid(int amount){
        return amount > 0;
    }
    static boolean isHigh(int amount){
        return amount > 3000;
    }
    static void print(String message){
        System.out.println(message);
    }
}
