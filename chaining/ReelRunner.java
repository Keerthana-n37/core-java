class ReelRunner
{
    public static void main(String[] args)
    {
        System.out.println("Reel 1");
        VideoReel reel1 = new VideoReel("Travel", 500);
        reel1.display();

        System.out.println("Reel 2");
        VideoReel reel2 = new VideoReel("Instagram", 45, "Karthik", "Food", 1200);
        reel2.display();

        System.out.println("Reel 3 ");
        VideoReel reel3 = new VideoReel(60, "Rahul", "Tech", 900);
        reel3.display();
    }
}