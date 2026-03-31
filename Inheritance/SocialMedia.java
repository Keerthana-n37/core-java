class SocialMedia extends Media 
{
    String platform;
    int followers;
    boolean verified;
    int posts;
    String contentType;

    SocialMedia() 
	{
        super();
        System.out.println("SocialMedia constructor called...");
    }

    void uploadPost() 
	{
        System.out.println("Uploading post...");
    }

    void goLive() 
	{
        System.out.println("Going live...");
    }
}
