public class BagRunner {
    public static void main(String[] args) {

        Bag.bagInfo("SchoolBag", "Blue", 20);
        Bag.bagInfo("TravelBag", "Black", 35);

        Bag.addItem("SchoolBag", "Books", 5);
        Bag.addItem("SchoolBag", "Pencil", 10);
        Bag.addItem("TravelBag", "Clothes", 15);
        Bag.addItem("TravelBag", "Shoes", 2);
    }
}
