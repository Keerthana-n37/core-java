class CarrotHalwa
{
    long[] portionCounts; 
    Topping[] toppings;

    CarrotHalwa(long[] portionCounts, Topping[] toppings)
    {
        this.portionCounts = portionCounts;
        this.toppings = toppings;
    }

    void display()
    {
        System.out.println("CarrotHalwa Information");

        if(this.portionCounts != null)
        {
            System.out.println("Total Portions: " + this.portionCounts.length);
            for(long portion : this.portionCounts)
            {
                System.out.println("Portion Count: " + portion);
            }
        }
        else
        {
            System.out.println("portionCounts is null");
        }

        if(this.toppings != null)
        {
            System.out.println("Total Toppings: " + this.toppings.length);
            for(Topping topping : this.toppings)
            {
                System.out.println("Topping Name: " + topping.name);
                System.out.println("Weight: " + topping.weight + " g");
                System.out.println("Optional: " + topping.isOptional);
            }
        }
        else
        {
            System.out.println("toppings are null");
        }
    }
}