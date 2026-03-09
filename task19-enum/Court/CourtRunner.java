class CourtRunner
{
	public static void main(String[] values)
	{
		Judge judge1=new Judge(20,"Criminal Law");
		Court court1=new Court(500,judge1,CourtCategory.SUPREME_COURT);
		court1.printInfo();
		
		Judge judge2=new Judge(15,"Civil Law");
		Court court2=new Court(500,judge2,CourtCategory.HIGH_COURT);
		court2.printInfo();
		
		Judge judge3=new Judge(18,"Family Law");
		CourtCategory category=CourtCategory.DISTRICT_COURT;
		Court court3=new Court(200,judge3,category);
		court3.printInfo();
		
		Judge judge4=new Judge(22,"Constitutional Law");
		CourtCategory category1=CourtCategory.FAMILY_COURT;
		Court court4=new Court(200,judge4,category1);
		court4.printInfo();
	}
}