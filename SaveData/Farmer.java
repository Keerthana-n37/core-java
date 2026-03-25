class Farmer
{
	String farmerName;
	int age;
	String villageName;
	String cropType;
	double landInAcres;
	boolean organicFarming;
	
	Farmer(String farmerName,int age, String villageName,String cropType,double landInAcres,boolean organicFraming)
	{
		this.farmerName=farmerName;
		this.age=age;
		this.villageName=villageName;
		this.cropType=cropType;
		this.landInAcres=landInAcres;
		this.organicFarming= organicFarming;
	}
	
	void displayFarmerDetails()
    {
        System.out.println("Executing displayFarmerDetails in Farmer");
        System.out.println("Farmer Name: " +this.farmerName);
        System.out.println("Age: " +this.age);
        System.out.println("Village: " +this.villageName);
        System.out.println("Crop Type: " +this.cropType);
        System.out.println("Land in acres: " +this.landInAcres);
        System.out.println("Organic Farming: " +this.organicFarming);
        System.out.println("---------------------------");
    }
}