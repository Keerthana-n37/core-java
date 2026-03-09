class ParliamentRunner
{
	public static void main(String[] args)
	{
		Speaker speaker1=new Speaker(10,"Bangalore");
		HouseType type=HouseType.LOKSABHA;
		
		Parliament parliament1=new Parliament(545,speaker1,type);
		parliament1.printInfo();
		
		Speaker speaker2=new Speaker(15,"Delhi");
		Parliament parliament2=new Parliament(250,speaker2,HouseType.RAJYASABHA);
		parliament2.printInfo();
		
		Speaker speaker3=new Speaker(8,"Mumbai");
		HouseType type1=HouseType.SPECIAL_SESSION;
		
		Parliament parliament3=new Parliament(600,speaker3,HouseType.SPECIAL_SESSION);
		parliament3.printInfo();
		
		Speaker speaker4=new Speaker(12,"Chennai");
		Parliament parliament4=new Parliament(300,speaker4,HouseType.JOINT_SESSION);
		parliament4.printInfo();
	}
}