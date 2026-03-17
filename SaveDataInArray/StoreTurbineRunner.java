class StoreTurbineRunner
{
	public static void main(String[] args)
	{
		String[] turbineNames = new String[10];
		StoreTurbineNames storeTurbine = new StoreTurbineNames(turbineNames);
		
		storeTurbine.getTurbineName("Steam Turbine");
		storeTurbine.getTurbineName("Gas Turbine");
		storeTurbine.getTurbineName("Wind Turbine");
		storeTurbine.getTurbineName("Hydraulic Turbine");
		storeTurbine.getTurbineName("Pelton Turbine");
		storeTurbine.getTurbineName("Kaplan Turbine");
		storeTurbine.getTurbineName("Francis Turbine");
		storeTurbine.getTurbineName("Impulse Turbine");
		storeTurbine.getTurbineName("Reaction Turbine");
		storeTurbine.getTurbineName("Turbo Generator");
		System.out.println("--------------------");
		
		System.out.println("Search Found");
        boolean found = storeTurbine.searchTurbineName("Turbo Generator");
        System.out.println("Result: " + found);
		System.out.println("--------------------");

        System.out.println("Search Not Found");
        boolean notFound = storeTurbine.searchTurbineName("Suzlon S88"); 
        System.out.println("Result: " + notFound);
		System.out.println("--------------------");

        System.out.println("Search Null");
        boolean nullCheck = storeTurbine.searchTurbineName(null);
        System.out.println("Result: " + nullCheck);
	}
}