class Health {
	
    boolean vaccinated;
    String lastCheckup;

    Health(boolean vaccinated, String lastCheckup) {
        this.vaccinated = vaccinated;
        this.lastCheckup = lastCheckup;
    }
	
	void getHealth()
	{
		System.out.println("Vaccinated: " + this.vaccinated);
        System.out.println("Last Checkup: " + this.lastCheckup);
	}
}