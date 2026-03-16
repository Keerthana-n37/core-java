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
	}
}