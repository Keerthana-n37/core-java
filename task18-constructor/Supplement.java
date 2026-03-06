class Supplement{
    String supplementName;
    Supplement(String supplementName) {
        System.out.println("Executing Supplement Constructor");
        this.supplementName = supplementName;
    }
	
	void getSupplement()
	{
		System.out.println("Tea supplement name is:"+this.supplementName);
	}
}