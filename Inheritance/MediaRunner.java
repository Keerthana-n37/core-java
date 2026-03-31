class MediaRunner 
{
    public static void main(String[] args) 
	{

        System.out.println("Subclass Object Same Type");

        SocialMedia media = new SocialMedia();
        media.mediaName = "NewsDaily";
        media.category = "News";
        media.viewers = 50000;
        media.online = true;
        media.platform = "Instagram";
        media.followers = 200000;
        media.verified = true;
        media.posts = 1200;
        media.contentType = "Video";

        System.out.println(media.mediaName);
        System.out.println(media.category);
        System.out.println(media.viewers);
        System.out.println(media.online);
        System.out.println(media.platform);
        System.out.println(media.followers);
        System.out.println(media.verified);
        System.out.println(media.posts);
        System.out.println(media.contentType);

        media.broadcast();
        media.stopBroadcast();
        media.uploadPost();
        media.goLive();


        System.out.println("Parent Reference Subclass Object");

        Media basicMedia = new SocialMedia();
        basicMedia.mediaName = "RadioOne";
        basicMedia.category = "Music";
        basicMedia.viewers = 30000;
        basicMedia.online = false;

        System.out.println(basicMedia.mediaName);
        System.out.println(basicMedia.category);
        System.out.println(basicMedia.viewers);
        System.out.println(basicMedia.online);

        basicMedia.broadcast();
        basicMedia.stopBroadcast();


        System.out.println("Parent Class Object");

        Media media1 = new Media();
        media1.mediaName = "LocalTV";
        media1.category = "Entertainment";
        media1.viewers = 10000;
        media1.online = true;

        System.out.println(media1.mediaName);
        System.out.println(media1.category);
        System.out.println(media1.viewers);
        System.out.println(media1.online);

        media1.broadcast();
        media1.stopBroadcast();
    }
}