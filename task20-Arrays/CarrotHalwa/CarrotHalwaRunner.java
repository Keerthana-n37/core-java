class CarrotHalwaRunner
{
    public static void main(String[] args)
    {
        long[] portionCounts = {50, 60, 45, 70, 55};

        Topping[] toppings = new Topping[5];
        toppings[0] = new Topping("Almonds", 15.5f, true);
        toppings[1] = new Topping("Cashews", 10.0f, false);
        toppings[2] = new Topping("Raisins", 8.0f, true);
        toppings[3] = new Topping("Saffron", 2.5f, false);
        toppings[4] = new Topping("Cardamom", 1.0f, true);

        CarrotHalwa carrotHalwa = new CarrotHalwa(portionCounts, toppings);
        carrotHalwa.display();
    }
}