class Carrom
{
    String brand;
    String material;
    double size;
    int coins;
    double price;

    Carrom()
    {
        System.out.println("Executing the no parameter constructor");
    }

    Carrom(String brand,int coins)
    {
        this.brand=brand;
        this.coins=coins;
    }

    Carrom(double size,double price)
    {
        this.size=size;
        this.price=price;
    }

    Carrom(String material,String brand)
    {
        this.material=material;
        this.brand=brand;
    }

    Carrom(String brand,double size)
    {
        this.brand=brand;
        this.size=size;
    }

    Carrom(String brand,String material,double size,int coins,double price)
    {
        this.brand=brand;
        this.material=material;
        this.size=size;
        this.coins=coins;
        this.price=price;
    }
}