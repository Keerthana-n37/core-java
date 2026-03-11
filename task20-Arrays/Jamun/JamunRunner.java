class JamunRunner
{
	public static void main(String[] args)
	{
		float[] jamunWeight={15.5f,20.0f,18.2f};
		
		Filling[] fillings = new Filling[3];
		fillings[0] = new Filling("Kesar", true);
		fillings[1]= new Filling("Chacolate", true);
		fillings[2] = new Filling("Dry Fruit", true);
		
		Jamun jamun = new Jamun(jamunWeight, fillings);
		jamun.display();
	}
}