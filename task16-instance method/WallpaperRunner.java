class WallpaperRunner{
	public static void main(String[] args)
	{
		Wallpaper wallpaper= new Wallpaper(1,1920,1080,16.9f,24,"Blue","JPG",500,true,"C:/wall1","thumb1.jpg","Ocean",
		                     "Beautiful ocean view","Ravi","Free",true,"Nature",4.5,2023,1000,"Nature" );
	    wallpaper.wallpaperDetails();
		
		Wallpaper wallpaper1=new Wallpaper(2,1280,720,16.9f,16,"Red","PNG",300,false,"C:/wall2","thumb2.jgp","Sunset","Evening sunset",
		                      "Anjali","Premium",false,"Sky",4.0,2022,800,"Sky");
	    wallpaper1.wallpaperDetails();
		
		Wallpaper wallpaper2=new Wallpaper(3,2560,1440,21.9f,32,"Green","JPEG",800,true,"C:/wall3","thumb3.jpg","Forest",
		                      "Deep forest","Kiran","Free",true,"Nature",4.8,2024,2000,"Nature");
		wallpaper2.wallpaperDetails();
		
        Wallpaper wallpaper3 = new Wallpaper(4,1600,900,16.9f,24,"Yellow","JPG",450,false,"C:/wall4","thumb4.jpg","Desert",
                        "Hot desert view","Meena","Standard",false,"Sand",3.9,2021,600,"Desert");
        wallpaper3.wallpaperDetails();

        Wallpaper wallpaper4 = new Wallpaper(5,3840,2160,16.9f,32,"Black","PNG",1200,true,"C:/wall5","thumb5.jpg","Night City",
                        "City lights at night","Arjun","Premium",true,"City",4.7,2023,2500,"City");
        wallpaper4.wallpaperDetails();

        Wallpaper wallpaper5 = new Wallpaper(6,1024,768,4.3f,16,"Pink","JPEG",280,false,"C:/wall6","thumb6.jpg","Flowers",
                        "Pink flower garden","Sneha","Free",false,"Floral",4.2,2020,500,"Floral");
        wallpaper5.wallpaperDetails();

        Wallpaper wallpaper6 = new Wallpaper(7,1366,768,16.9f,24,"Purple","PNG",350,true,"C:/wall7","thumb7.jpg","Galaxy",
                        "Beautiful galaxy space","Vijay","Premium",true,"Space",4.9,2024,3000,"Space");
        wallpaper6.wallpaperDetails();

        Wallpaper wallpaper7 = new Wallpaper(8,1920,1200,16.10f,24,"Orange","JPG",600,false,"C:/wall8","thumb8.jpg","Mountains",
                        "Snow mountains","Divya","Standard",true,"Adventure",4.3,2022,1200,"Adventure");
        wallpaper7.wallpaperDetails();

        Wallpaper wallpaper8 = new Wallpaper(9,1440,900,16.10f,16,"White","PNG",420,true,"C:/wall9","thumb9.jpg","Clouds",
                        "White clouds in sky","Rahul","Free",false,"Sky",3.8,2021,750,"Sky");
        wallpaper8.wallpaperDetails();

        Wallpaper wallpaper9 = new Wallpaper(10,2560,1600,16.10f,32,"Grey","JPEG",900,true,"C:/wall10","thumb10.jpg","Abstract",
                        "Modern abstract art","Sita","Premium",true,"Art",4.6,2024,1800,"Abstract");
        wallpaper9.wallpaperDetails();	
	}		
	
}