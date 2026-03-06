class Drive {
    String driveName;
    int totalSpace;

    Drive(String driveName, int totalSpace) {
        this.driveName = driveName;
        this.totalSpace = totalSpace;
		System.out.println("Executing drive constructor");
		System.out.println("Name of drive:"+driveName);
		System.out.println("Total space of drive:"+totalSpace);
		System.out.println("-----------------");
    }
}