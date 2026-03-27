class GenderRunner
{
	public static void main(String[] args)
	{
		System.out.println("Ascending order:");
		Gender.sortAsc();
		Gender.display();
		
		System.out.println("Descending order:");
		Gender.sortDesc();
		Gender.display();
	}
}