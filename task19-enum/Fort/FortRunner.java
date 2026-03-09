class FortRunner{
	
	public static void main(String[] args)
	{
		Guard guard1=new Guard("Raja",15);
		Fort fort1=new Fort(100,"Amber fort",guard1,FortType.HILL_FORT);
		fort1.printInfo();
		
		Guard guard2=new Guard("Paratap",20);
		FortType type=FortType.SEA_FORT;
		Fort fort2=new Fort(50,"Sindhudurg Fort",guard2,type);
		fort2.printInfo();
		
		Guard guard3=new Guard("Arjun",18);
		Fort fort3=new Fort(80,"Jaisalmer Fort",guard3,FortType.DESERT_FORT);
		fort3.printInfo();
		
		Guard guard4=new Guard("Kumar",22);
		FortType type1=FortType.ISLAND_FORT;
		Fort fort4 = new Fort(60, "Elephanta Fort", guard4,type1);
        fort4.printInfo();
	}
}