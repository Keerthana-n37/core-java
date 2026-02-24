class BreadRunner {
    public static void main(String[] args)
    {
        Bread bread1 = new Bread();
        bread1.type = "White Bread";
        bread1.outletNames = new String[]{"Reliance Store", "Supermarket", "DMart"};
        bread1.ingredients = new String[]{"Wheat Flour", "Yeast", "Salt", "Sugar"};
        bread1.shape = "Rectangle";
        System.out.println("Bread1 Details:");
        System.out.println("Type:" + bread1.type);
        System.out.println("Shape:" + bread1.shape);
        System.out.println("Outlet Names:");
        for(int index = 0; index < bread1.outletNames.length; index++)
        {
            System.out.println(bread1.outletNames[index]);
        }
        System.out.println("Ingredients:");
        for(int index = 0; index < bread1.ingredients.length; index++)
        {
            System.out.println(bread1.ingredients[index]);
        }
        System.out.println("-----------------");

        Bread bread2 = new Bread();
        bread2.type = "Brown Bread";
        bread2.outletNames = new String[]{"Big Bazaar", "Bakery", "Star Bazaar"};
        bread2.ingredients = new String[]{"Whole Wheat", "Salt", "Honey", "Milk"};
        bread2.shape = "Oval";
        System.out.println("Bread2 Details:");
        System.out.println("Type:" + bread2.type);
        System.out.println("Shape:" + bread2.shape);
        System.out.println("Outlet Names:");
        for(int index = 0; index < bread2.outletNames.length; index++)
        {
            System.out.println(bread2.outletNames[index]);
        }
        System.out.println("Ingredients:");
        for(int index = 0; index < bread2.ingredients.length; index++)
        {
            System.out.println(bread2.ingredients[index]);
        }
        System.out.println("-----------------");
    }
}