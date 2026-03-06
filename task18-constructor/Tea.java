class Tea{
	int teaSerial;
	double cost;
	char portionCode;
	boolean isSteamy;
	long steepMinutes;
	
	LeafExpert expert;
	Patron patron;
	TeaMix mix;
	MugType mugType;
	Supplement supplement;
	
	Tea(int teaSerial,double cost,char portionCode,boolean isSteamy,long steepMinutes,
	LeafExpert expert,Patron patron, TeaMix mix,MugType mugType, Supplement supplement)
	{
		System.out.println("Executing tea constructor");
		this.teaSerial=teaSerial;
		this.cost=cost;
		this.portionCode=portionCode;
		this.isSteamy=isSteamy;
		this.steepMinutes=steepMinutes;
		
		this.expert=expert;
		this.patron=patron;
		this.mix=mix;
		this.mugType=mugType;
		this.supplement=supplement;
		
		System.out.println("Tea Serial: " + teaSerial);
        System.out.println("Cost: " + cost);
        System.out.println("Portion Code: " + portionCode);
        System.out.println("Is Steamy: " + isSteamy);
        System.out.println("Steep Minutes: " + steepMinutes);

        System.out.println("Leaf Expert: " + expert.fullName);
        System.out.println("Patron: " + patron.fullName);
        System.out.println("Tea Mix: " + mix.mixName);
        System.out.println("Mug Type: " + mugType.mugStyle);
        System.out.println("Supplement: " + supplement.supplementName);
	}
}