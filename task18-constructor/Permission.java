class Permission {
    String accessType;
    boolean canEdit;

    Permission(String accessType, boolean canEdit) {
        this.accessType = accessType;
        this.canEdit = canEdit;
		System.out.println("Executing permission constructor");
		
    }
	
	void getPermission()
	{
		System.out.println("Acess type of file:"+this.accessType);
		System.out.println("Can edit the file:"+this.canEdit);
	}
	
}