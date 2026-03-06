class File{
	String fileName;
	String fileFormat;
	double fileSize;
	long createdTime;
	String filePath;
	
	Folder folder;
	Owner owner;
	Drive drive;
	Permission permission;
	Backup backup;
	
	File(String fileName,String fileFormat,double fileSize,long createdTime,String filePath,
	Folder folder,Owner owner,Drive drive,Permission permission,Backup backup)
	{
		this.fileName=fileName;
		this.fileFormat=fileFormat;
		this.fileSize=fileSize;
		this.createdTime=createdTime;
		this.filePath=filePath;
		
		this.folder=folder;
		this.owner=owner;
		this.drive=drive;
		this.permission=permission;
		this.backup=backup;
		
		System.out.println("Executing file constructor");
		System.out.println("File name:"+fileName);
		System.out.println("File Format:"+fileFormat);
		System.out.println("File size:"+fileSize);
		System.out.println("File created time:"+createdTime);
		System.out.println("File path:"+filePath);
		System.out.println("---------------");
	}
}