class Bell{

    double weight;
    double volume;
    boolean isMusical;
    int ringCount;
    double price;

    SoundDesigner designer;
    Audience audience;
    Tone tone;
    Support support;
    Enhancer enhancer;

    Bell(double weight, double volume, boolean isMusical, int ringCount, double price,
         SoundDesigner designer, Audience audience, Tone tone, Support support, Enhancer enhancer) {

        System.out.println("Executing Bell Constructor");

        this.weight = weight;
        this.volume = volume;
        this.isMusical = isMusical;
        this.ringCount = ringCount;
        this.price = price;

        this.designer = designer;
        this.audience = audience;
        this.tone = tone;
        this.support = support;
        this.enhancer = enhancer;
    }
	
	
	void getBell()
	{
	    System.out.println("Weight: " + this.weight);
        System.out.println("Form Symbol: " +this.volume);
        System.out.println("Is Musical: " +this.isMusical);
        System.out.println("Ring Count: " + this.ringCount);
        System.out.println("Price:" + this.price);
		if(this.designer!=null)
		{
			this.designer.getDesigner();
		}
		else{
			System.out.println("Designer is not there");
		}
		if(this.audience!=null)
		{
			this.audience.getAudience();
		}
		else{
			System.out.println("Audience is not there");
		}
		if(this.tone!=null)
		{
			
			this.tone.getTone();
		}
		else{
			System.out.println("IsMusical is not there");
		}
		if(this.support!=null)
		{
			this.support.getSupport();
		}
		else{
			System.out.println("Ring Count is not there");
		}
		
		if(this.enhancer!=null)
		{
			this.enhancer.getEnhancer();
		}
		else{
			System.out.println("Price is not there");
		}
	}
	
	
}