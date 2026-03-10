class PaneerAttributes{
	String milkSource;
	int proteinContent;
	String freshnessLevel;
	
	PaneerAttributes(String milkSource,int proteinContent,String freshnessLevel)
	{
		this.milkSource=milkSource;
		this.proteinContent=proteinContent;
		this.freshnessLevel=freshnessLevel;
	}
	
	
	void showAttributes() 
	{
        System.out.println("Milk Source: " + this.milkSource);
        System.out.println("Protein Content: " + this.proteinContent + " grams");
        System.out.println("Freshness Level: " + this.freshnessLevel);
    }
}