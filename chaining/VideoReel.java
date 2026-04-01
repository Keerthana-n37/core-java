class VideoReel extends Reel
{
    String category;
    int likes;

    VideoReel(String category, int likes)
    {
        super("Instagram", 30, "Nikitha");
        this.category = category;
        this.likes = likes;
        System.out.println("Constructor 1 called: Default reel created");
    }

    VideoReel(String platform, int duration, String creator, String category, int likes)
    {
        super(platform, duration, creator);
        this.category = category;
        this.likes = likes;
        System.out.println("Constructor 2 called: Full reel details provided");
    }

    VideoReel(int duration, String creator,String category, int likes)
    {
        super("YouTube Shorts", duration, creator);
        this.category = category;
        this.likes = likes;
        System.out.println("Constructor 3 called: Custom duration and creator");
    }

    void display()
    {
        System.out.println("Platform: " + super.platform);
        System.out.println("Duration: " + super.duration + " seconds");
        System.out.println("Creator: " + super.creator);
        System.out.println("Category: " + this.category);
        System.out.println("Likes: " + this.likes);
        System.out.println("----------------------");
    }
}