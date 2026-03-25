class Acid
{
	String acidName;
	String chemicalFormula;
	int phValue;
	String use;
	boolean strongAcid;
	String color;
	
	Acid(String acidName,String chemicalFormula, int phValue,String use,boolean strongAcid, String color)
	{
		this.acidName=acidName;
		this.chemicalFormula= chemicalFormula;
		this.phValue= phValue;
		this.use= use;
		this.strongAcid = strongAcid;
		this.color= color;
	}
	
	void displayAcidDetials()
	{
		System.out.println("Executing displayAcidDetails in Acid");
        System.out.println("Acid Name: " +this.acidName);
        System.out.println("Chemical Formula: " +this.chemicalFormula);
        System.out.println("pH Value: " +this.phValue);
        System.out.println("Common Use: " +this.use);
        System.out.println("Is Strong Acid: " +this.strongAcid);
        System.out.println("Color: " +this.color);
        System.out.println("-----------------------------");
	}
}