class Advertiser{
    String adName;

    Advertiser(String adName) {
        System.out.println("Executing Advertiser Constructor");
        this.adName = adName;
    }
	
	void getAdvertiser()
	{
		System.out.println("Advertisement name:"+this.adName);
	}
}