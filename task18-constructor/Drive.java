class Drive {
    String driveName;
    int totalSpace;

    Drive(String driveName, int totalSpace) {
        this.driveName = driveName;
        this.totalSpace = totalSpace;
		System.out.println("Executing drive constructor");
	
    }
	
	void getDrive()
	{
		System.out.println("Name of drive:"+this.driveName);
		System.out.println("Total space of drive:"+this.totalSpace);
	}
}