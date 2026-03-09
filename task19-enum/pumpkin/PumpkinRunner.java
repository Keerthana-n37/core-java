class PumpkinRunner{
	
	public static void main(String[] args)
	{
		Farmer farmer1=new Farmer("Ramesh",12);
		Pumpkin pumpkin1=new Pumpkin(8,farmer1,PumpkinType.JACK_O_LANTERN);
		pumpkin1.printInfo();
		
		Farmer farmer2=new Farmer("Raja",10);
		PumpkinType type=PumpkinType.SUGAR_PIE;
		Pumpkin pumpkin2 = new Pumpkin(5, farmer2, type);
        pumpkin2.printInfo();

        Farmer farmer3 = new Farmer("Vikram", 15);
        Pumpkin pumpkin3 = new Pumpkin(6, farmer3, PumpkinType.CINDERELLA);
        pumpkin3.printInfo();

        Farmer farmer4 = new Farmer("Vishal", 18);
		PumpkinType type1=PumpkinType.KABOCHA;
        Pumpkin pumpkin4 = new Pumpkin(7, farmer4,type1);
        pumpkin4.printInfo();
		
	}
}