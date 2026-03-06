class Folder{
	String folderName;
	String folderLocation;
	
	Folder(String folderName,String folderLocation)
	{
		this.folderName=folderName;
		this.folderLocation=folderLocation;
		
		System.out.println("Executing the folder constructor");
	}
	
	void getFolder()
	{
		System.out.println("Folder name:"+this.folderName);
		System.out.println("Folder location:"+this.folderLocation);
	}
}