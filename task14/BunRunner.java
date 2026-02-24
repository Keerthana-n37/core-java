class BunRunner {
    public static void main(String[] args)
    {
        Bun bun1 = new Bun();
        bun1.name = "Sweet Bun";
        bun1.brand = "Britannia";
        bun1.price = 25;
        bun1.weight = 100;
        bun1.flavor = "Vanilla";
        bun1.type = "Veg";
        bun1.fresh = true;
        bun1.shape = "Round";
        bun1.ingredients = new String[]{"Flour", "Sugar", "Milk"};
        bun1.availableStores = new String[]{"DMart", "Reliance"};

        System.out.println("Bun1 Details:");
        System.out.println("Name:" + bun1.name);
        System.out.println("Brand:" + bun1.brand);
        System.out.println("Price:" + bun1.price);
        System.out.println("Weight:" + bun1.weight);
        System.out.println("Flavor:" + bun1.flavor);
        System.out.println("Type:" + bun1.type);
        System.out.println("Fresh:" + bun1.fresh);
        System.out.println("Shape:" + bun1.shape);

        System.out.println("Ingredients:");
        for(int index = 0; index < bun1.ingredients.length; index++)
        {
            System.out.println(bun1.ingredients[index]);
        }

        System.out.println("Available Stores:");
        for(int index = 0; index < bun1.availableStores.length; index++)
        {
            System.out.println(bun1.availableStores[index]);
        }

        System.out.println("-----------------");


        Bun bun2 = new Bun();
        bun2.name = "Cream Bun";
        bun2.brand = "Modern";
        bun2.price = 30;
        bun2.weight = 120;
        bun2.flavor = "Chocolate";
        bun2.type = "Veg";
        bun2.fresh = true;
        bun2.shape = "Oval";
        bun2.ingredients = new String[]{"Flour", "Cocoa", "Milk"};
        bun2.availableStores = new String[]{"Big Bazaar", "Spencer's"};

        System.out.println("Bun2 Details:");
        System.out.println("Name:" + bun2.name);
        System.out.println("Brand:" + bun2.brand);
        System.out.println("Price:" + bun2.price);
        System.out.println("Weight:" + bun2.weight);
        System.out.println("Flavor:" + bun2.flavor);
        System.out.println("Type:" + bun2.type);
        System.out.println("Fresh:" + bun2.fresh);
        System.out.println("Shape:" + bun2.shape);

        System.out.println("Ingredients:");
        for(int index = 0; index < bun2.ingredients.length; index++)
        {
            System.out.println(bun2.ingredients[index]);
        }

        System.out.println("Available Stores:");
        for(int index = 0; index < bun2.availableStores.length; index++)
        {
            System.out.println(bun2.availableStores[index]);
        }

        System.out.println("-----------------");
    }
}