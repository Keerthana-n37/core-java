class Pumpkin{
	 
	 int weight;
	 Farmer farmer;
	 PumpkinType pumpkinType;
	 
	 Pumpkin(int weight,Farmer farmer, PumpkinType pumpkinType)
	 {
		 this.weight=weight;
		 this.farmer=farmer;
		 this.pumpkinType=pumpkinType;
	 }
	 
	 
	 void printInfo()
	 {
		 System.out.println("weight:"+this.weight);
		 
		 
		 if(farmer!=null)
		 {
			 this.farmer.aboutFarmer();
		 }
		 else
		 {
			 System.out.println("Farmer is null");
		 }
		 
		 System.out.println("Pumpkin type:"+this.pumpkinType);
		 System.out.println("-----------------------");
	 }
}