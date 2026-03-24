class Tollgate
{
	String tollName;
	String highway;
	double tollFee;
	String city;
	boolean open24hours;
	int numberOFLanes;
	
	Tollgate(String tollName,String highway,double tollFee,String city,boolean open24hours,int numberOFLanes)
	{
		this.tollName=tollName;
		this.highway=highway;
		this.tollFee=tollFee;
		this.city=city;
		this.open24hours=open24hours;
		this.numberOFLanes=numberOFLanes;
	}
	
	void displayTollgateDetails()
	{
		System.out.println("Executing displayTollgateDetails in Tollgate");
		System.out.println("Toll Name:"+this.tollName);
		System.out.println("Highway: "+this.highway);
		System.out.println("Toll Fee: "+this.tollFee);
		System.out.println("City: "+this.city);
		System.out.println("Open for 24 houra: "+this.open24hours);
		System.out.println("Number of Lanes: "+this.numberOFLanes);
		System.out.println("----------------------");
	}
}