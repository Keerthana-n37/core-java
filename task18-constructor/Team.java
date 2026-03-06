class Team{
	String teamName;
	String sport;
	
	Team(String teamName,String sport){
		this.teamName=teamName;
		this.sport=sport;
	}
	
	void getTeam()
	{
	    System.out.println("Coach team Name: " + this.teamName);
        System.out.println("Coach team Sport: " + this.sport);
	}
}