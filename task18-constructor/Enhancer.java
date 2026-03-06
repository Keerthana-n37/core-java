class Enhancer{
    String name;
    Enhancer(String name) {
        System.out.println("Executing Enhancer Constructor");
        this.name = name;
    }
	
	void getEnhancer()
	{
		System.out.println("Bell enhancer name is:"+this.name);
	}
}