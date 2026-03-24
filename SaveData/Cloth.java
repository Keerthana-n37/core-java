class Cloth
{
    String clothName;
    String clothColor;
    String fabricType;
    String size;
    int price;
    boolean washable;

    Cloth(String clothName,String clothColor,String fabricType,String size,int price,boolean washable)
    {
        this.clothName= clothName;
        this.clothColor= clothColor;
        this.fabricType= fabricType;
        this.size= size;
        this.price= price;
        this.washable= washable;
    }

    void displayClothDetails()
    {
        System.out.println("Executing displayClothDetails in Cloth");
        System.out.println("Cloth Name: "+this.clothName);
        System.out.println("Cloth Color: "+this.clothColor);
        System.out.println("Fabric Type: "+this.fabricType);
        System.out.println("Size: "+this.size);
        System.out.println("Price: "+this.price);
        System.out.println("Is Washable: "+this.washable);
        System.out.println("---------------------------");
    }
}