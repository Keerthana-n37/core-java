class IntSwitchRunner{
	public static void main(String[] args)
	{
		performMath(2);
		performMath(5);
	}
	
	static void performMath(int choice)
	{
		switch(choice)
		{
			case 1:
			IntSwitch.addition();
			break;
			case 2:
			IntSwitch.substraction();
			break;
			case 3:
			IntSwitch.multiplication();
			break;
			case 4:
			IntSwitch.division();
			break;
			case 5:
			IntSwitch.modulus();
			break;
			default:
			System.out.println("Invalid choice");
		}
	}
}