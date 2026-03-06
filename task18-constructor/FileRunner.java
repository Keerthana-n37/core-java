class FileRunner{
	
	public static void main(String[] args){

    Folder folder=new Folder("Projects","D:/Projects");
	Owner owner=new Owner("Anu","anu@gmail.com");
	Drive drive= new Drive("D",500);
	Permission permission=new Permission("Read and write",true);
	Backup backup=new Backup(true,"Cloud");
	
	File file=new File("Assignment","PDF",2.5,05032026,"D:/Projects/Assignment.pdf",
	folder,owner,drive,permission,backup);
	
	file.getFile();
	}
	
}
