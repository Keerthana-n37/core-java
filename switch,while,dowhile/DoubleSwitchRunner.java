class DoubleSwitchRunner{
    public static void main(String[] args) {
        evaluatePrice(20.0);
        evaluatePrice(35.0);
        evaluatePrice(50.0);
    }

    static void evaluatePrice(double price) {
        int roundedPrice = (int) price; 
        switch (roundedPrice) {
            case 15:
                DoubleSwitch.smallDiscount();
                break;
            case 20:
                DoubleSwitch.mediumDiscount();
                break;
            case 35:
                DoubleSwitch.highDiscount();
                break;
            case 40:
                DoubleSwitch.veryHighDiscount();
                break;
            case 50:
                DoubleSwitch.specialDiscount();
                break;
            default:
                System.out.println("No discount available");
        }
    }
}