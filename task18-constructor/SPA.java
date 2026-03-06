class SPA{
	int sessionCode;
	double price;
	char packageCode;
	boolean isLuxury;
	long duration;
	
	Specialist specialist;
	Guest guest;
	Therapy therapy;
	Cabin cabin;
	ProductKit productKit;
	
	SPA(int sessionCode, double price, char packageCode, boolean isLuxury, long duration,
        Specialist specialist, Guest guest, Therapy therapy, Cabin cabin, ProductKit productKit)
		{
			this.sessionCode=sessionCode;
			this.price=price;
			this.packageCode=packageCode;
			this.isLuxury=isLuxury;
			this.duration=duration;
			this.specialist=specialist;
			this.guest=guest;
			this.therapy=therapy;
			this.cabin=cabin;
			this.productKit=productKit;
		
		}
		
		
    void getSPAInfo()
	{
			System.out.println("Session Code: " + this.sessionCode);
			System.out.println("Price: " + this.price);
			System.out.println("Level Code: " +this.packageCode);
			System.out.println("Luxury Session: " +this.isLuxury);
			System.out.println("Duration: " + this.duration);
			
			
	       if(this.specialist!=null)
		   {
			 this.specialist.getSpecialist();  
		   }
		   else{
			   System.out.println("Specialist value is null");
		   }
		   
		   if(this.guest!=null)
		   {
			   this.guest.getGuest();
		   }
		   else{
			   System.out.println("Guest value is null");
		   }
		   
		   if(this.therapy!=null)
		   {
			   this.therapy.getTherapy();
		   }
		   else{
			   System.out.println("Therapy is null");
		   }
		   
		   if(this.cabin!=null)
		   {
			   this.cabin.getCabin();
		   }
		   else{
			   System.out.println("Cabin value is null");
		   }
		   
		   if(this.productKit!=null)
		   {
			   this.productKit.getProductKit();
		   }
		   else{
			   System.out.println("ProductKit value is null");
		   }

	}	
}