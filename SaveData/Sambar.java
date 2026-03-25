class Sambar
{
    String hotel;
    String dal;
    String taste;
    int price;
    boolean veg;
    String style;

    Sambar(String hotel, String dal, String taste, int price, boolean veg, String style)
    {
        this.hotel = hotel;
        this.dal = dal;
        this.taste = taste;
        this.price = price;
        this.veg = veg;
        this.style = style;
    }

    void showDetails()
    {
        System.out.println("Showing Sambar Details");
        System.out.println("Hotel: " + this.hotel);
        System.out.println("Dal Used: " + this.dal);
        System.out.println("Taste: " + this.taste);
        System.out.println("Price: " + this.price);
        System.out.println("Vegetables Added: " + this.veg);
        System.out.println("Style: " + this.style);
        System.out.println("---------------------");
    }
}