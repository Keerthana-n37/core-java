class Permission {
    String accessType;
    boolean canEdit;

    Permission(String accessType, boolean canEdit) {
        this.accessType = accessType;
        this.canEdit = canEdit;
		System.out.println("Executing permission constructor");
		System.out.println("Acess type of file:"+accessType);
		System.out.println("Can edit the file:"+canEdit);
		System.out.println("-----------------");
    }
}