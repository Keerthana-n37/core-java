class Backup {
    boolean backupEnabled;
    String backupLocation;

    Backup(boolean backupEnabled, String backupLocation) {
        this.backupEnabled = backupEnabled;
        this.backupLocation = backupLocation;
		
		System.out.println("Executing backup constructor");
		
    }
	
	void getBackup()
	{
		System.out.println("Is backup enabled:"+this.backupEnabled);
		System.out.println("Backup location:"+this.backupLocation);
	}
}