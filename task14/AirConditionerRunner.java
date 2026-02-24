class AirConditionerRunner {
    public static void main(String[] args)
    {
        AirConditioner airConditioner1 = new AirConditioner();
        airConditioner1.brand = "LG";
        airConditioner1.model = "X123";
        airConditioner1.price = 35000;
        airConditioner1.type = "Split";
        airConditioner1.weight = 25.5;
        airConditioner1.colors = new String[]{"White", "Silver"};
        airConditioner1.warranty = 2;
        airConditioner1.working = true;

        System.out.println("AirConditioner1 Details:");
        System.out.println("Brand:" + airConditioner1.brand);
        System.out.println("Model:" + airConditioner1.model);
        System.out.println("Price:" + airConditioner1.price);
        System.out.println("Type:" + airConditioner1.type);
        System.out.println("Weight:" + airConditioner1.weight);
        System.out.println("Warranty:" + airConditioner1.warranty);
        System.out.println("Working:" + airConditioner1.working);
        System.out.println("Colors:");
        for(int index = 0; index < airConditioner1.colors.length; index++)
        {
            System.out.println(airConditioner1.colors[index]);
        }
        System.out.println("-----------------");

        AirConditioner airConditioner2 = new AirConditioner();
        airConditioner2.brand = "Samsung";
        airConditioner2.model = "Y456";
        airConditioner2.price = 42000;
        airConditioner2.type = "Window";
        airConditioner2.weight = 30.0;
        airConditioner2.colors = new String[]{"White", "Black"};
        airConditioner2.warranty = 3;
        airConditioner2.working = true;

        System.out.println("AirConditioner2 Details:");
        System.out.println("Brand:" + airConditioner2.brand);
        System.out.println("Model:" + airConditioner2.model);
        System.out.println("Price:" + airConditioner2.price);
        System.out.println("Type:" + airConditioner2.type);
        System.out.println("Weight:" + airConditioner2.weight);
        System.out.println("Warranty:" + airConditioner2.warranty);
        System.out.println("Working:" + airConditioner2.working);
        System.out.println("Colors:");
        for(int index = 0; index < airConditioner2.colors.length; index++)
        {
            System.out.println(airConditioner2.colors[index]);
        }
        System.out.println("-----------------");
    }
}