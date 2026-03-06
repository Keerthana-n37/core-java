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
		
	}
	
	void getTea()
	{
		System.out.println("Tea Serial: " + this.teaSerial);
        System.out.println("Cost: " + this.cost);
        System.out.println("Portion Code: " + this.portionCode);
        System.out.println("Is Steamy: " + this.isSteamy);
        System.out.println("Steep Minutes: " + this.steepMinutes);
		
		if(this.expert!=null)
		{
			this.expert.getExpert();
		}
		else{
			System.out.println("Expert is null");
		}
		
		if(this.patron!=null)
		{
			this.patron.getPatron();
		}
		else{
			System.out.println("Patron is null");
		}
		
		if(this.mix!=null)
		{
			this.mix.getTeaMix();
		}
		else{
			System.out.println("Mix is null");
		}
		
		if(this.mugType!=null)
		{
			this.mugType.getMugType();
		}
		else{
			System.out.println("MugType is null");
		}
		
		if(this.supplement!=null)
		{
			this.supplement.getSupplement();
		}
		else{
			System.out.println("Supplement is null");
		}
	}
}