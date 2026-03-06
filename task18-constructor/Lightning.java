class Lightning{
    String status;
    Lightning(String status){
        System.out.println("Executing Lightning Constructor");
        this.status = status;
    }
	
	void getLightning()
	{
		System.out.println("Getting the cloud lightning status:"+this.status);
	}
}