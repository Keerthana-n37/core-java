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

	}
	
	void getFile()
	{
		System.out.println("File name:"+this.fileName);
		System.out.println("File Format:"+this.fileFormat);
		System.out.println("File size:"+this.fileSize);
		System.out.println("File created time:"+this.createdTime);
		System.out.println("File path:"+this.filePath);
		
		if(this.folder!=null)
		{
			this.folder.getFolder();
		}
		else{
			System.out.println("Folder is null");
		}
		
		if(this.owner!=null)
		{
			this.owner.getOwner();
		}
		else{
			System.out.println("Owner value is null");
		}
		
		if(this.drive!=null)
		{
			this.drive.getDrive();
		}
		else{
			System.out.println("Drive value is null");
		}
		
		if(this.permission!=null)
		{
			this.permission.getPermission();
		}
		else{
			System.out.println("Permission value is null");
		}
		
		if(this.backup!=null)
		{
			this.backup.getBackup();
		}
		else{
			System.out.println("Backup value is null");
		}
	}
}