class Backup {
    boolean backupEnabled;
    String backupLocation;

    Backup(boolean backupEnabled, String backupLocation) {
        this.backupEnabled = backupEnabled;
        this.backupLocation = backupLocation;
		
		System.out.println("Executing backup constructor");
		System.out.println("Is backup enabled:"+backupEnabled);
		System.out.println("Backup location:"+backupLocation);
    }
}