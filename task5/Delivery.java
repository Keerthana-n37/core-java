class Delivery{
   static void pickUp()
   {
	   System.out.println("Delivery:pickUp started...");
	   Market.storeVegetable();
	   Market.storeGroceries();
	   Market.storeFruits();
	   Market.storeDryFruits();
	   Market.storejunkFood();
   }
}