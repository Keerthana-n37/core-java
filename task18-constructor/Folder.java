class Folder{
	String folderName;
	String folderLocation;
	
	Folder(String folderName,String folderLocation)
	{
		this.folderName=folderName;
		this.folderLocation=folderLocation;
		
		System.out.println("Executing the folder constructor");
		System.out.println("Folder name:"+folderName);
		System.out.println("Folder location:"+folderLocation);
		System.out.println("-----------------");
	}
}