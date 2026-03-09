class Parliament{
	
	int totalSeats;
	Speaker speaker;
	HouseType houseType;
	
	
	Parliament(int totalSeats,Speaker speaker,HouseType houseType)
	{
		this.totalSeats=totalSeats;
		this.speaker=speaker;
		this.houseType=houseType;
	}
	
	
	void printInfo()
	{
		System.out.println("Total seats in parliament:"+this.totalSeats);
		
		if(this.speaker!=null)
		{
			this.speaker.aboutSpeaker();
		}
		else{
			System.out.println("Speaker is null");
		}
		
		System.out.println("House Type:"+this.houseType);
		System.out.println("------------------");
	}
}