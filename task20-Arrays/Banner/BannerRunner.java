class BannerRunner
{
	public static void main(String[] args)
	{
		int[] bannerHeight = new int[4];
		bannerHeight[0] = 100;
		bannerHeight[1] = 150;
		bannerHeight[2] = 120;
		bannerHeight[3] = 180;
		
		Designer[] designers = new Designer[4];
        designers[0] = new Designer("Anuj", 5.5f);
        designers[1] = new Designer("Sanjay", 3.2f);
        designers[2] = new Designer("Srujan", 7.0f);
        designers[3] = new Designer("Dhanuj", 4.5f);
		
		Banner banner = new Banner(bannerHeight, designers);
        banner.display();
	}
}