class Banner
{
	int[] bannerHeight;
	Designer[] desginers;
	
	Banner(int[] bannerHeight,Designer[] desginers)
	{
		this.bannerHeight= bannerHeight;
		this.desginers= desginers;
	}
	
	void display()
	{
		System.out.println("Banner information");
		
		if(this.bannerHeight!=null)
		{
			System.out.println("Total Banner heights:"+this.bannerHeight.length);
			
			for(int height: this.bannerHeight)
			{
				System.out.println("Banner height:"+height);
			}
		}
		else{
			System.out.println("BannerHeight is empty");
		}
		
		if(this.desginers!= null)
		{
			System.out.println("Total desginers:"+this.desginers.length);
			for(Designer desginer: desginers)
			{
				System.out.println("Desginer name:"+desginer.name);
				System.out.println("Desginer experience:"+desginer.experience);
			}
		}
		else{
			System.out.println("Designer is empty");
		}
	}
}