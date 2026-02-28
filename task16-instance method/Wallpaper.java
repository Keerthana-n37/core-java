class Wallpaper{
	int wallpaperId;
	int width;
	int height;
	float aspectRatio;
	int colorDepth;
	String primaryColor;
	String format;
	int sizeInKB;
	boolean compressed;
	String fileLocation;
	String thumbnailName;
	String wallpaperTitle;
	String description;
	String creatorName;
	String license;
	boolean liveWallpaper;
	String themeType;
	double userRating;
	int releaseYear;
	int totalDownloads;
	String wallpaperCategory;
	
	Wallpaper(int wallpaperId, int width, int height, float aspectRatio,
              int colorDepth, String primaryColor, String format,
              int sizeInKB, boolean isCompressed, String fileLocation,
              String thumbnailName, String wallpaperTitle, String description,
              String creatorName, String license, boolean isLiveWallpaper,
              String themeType, double userRating, int releaseYear,
              int totalDownloads, String wallpaperCategory)
			  {
				  this.wallpaperId=wallpaperId;
				  this.width=width;
				  this.height=height;
				  this.aspectRatio=aspectRatio;
				  this.colorDepth=colorDepth;
				  this.primaryColor=primaryColor;
				  this.format=format;
				  this.sizeInKB=sizeInKB;
				  this.compressed=compressed;
				  this.fileLocation=fileLocation;
				  this.thumbnailName=thumbnailName;
				  this.wallpaperTitle=wallpaperTitle;
				  this.description=description;
				  this.creatorName=creatorName;
				  this.license=license;
				  this.liveWallpaper=liveWallpaper;
				  this.themeType=themeType;
				  this.userRating=userRating;
				  this.releaseYear=releaseYear;
				  this.totalDownloads=totalDownloads;
				  this.wallpaperCategory=wallpaperCategory;
			  }
			  
	void wallpaperDetails()
	{
		System.out.println("WallPaper ID:"+this.wallpaperId);
		System.out.println("Width:"+this.width);
		System.out.println("Height:"+this.height);
		System.out.println("Aspect Ratio:"+this.aspectRatio);
		System.out.println("Colo depth:"+this.aspectRatio);
		System.out.println("Primary color:"+this.primaryColor);
		System.out.println("Format:"+this.format);
		System.out.println("Size:"+this.sizeInKB);
		System.out.println("Compressed:"+this.compressed);
		System.out.println("File location:"+this.fileLocation);
		System.out.println("Thumbnail:"+this.thumbnailName);
		System.out.println("Title:"+this.wallpaperTitle);
		System.out.println("Description:"+this.description);
		System.out.println("Creator:"+this.creatorName);
		System.out.println("License:"+this.license);
		System.out.println("Live Wallpaper:"+this.liveWallpaper);
		System.out.println("Theme:"+this.themeType);
		System.out.println("User Rating:"+this.userRating);
		System.out.println("Release Year:"+this.releaseYear);
		System.out.println("Total Downloads:"+this.totalDownloads);
		System.out.println("Category:"+this.wallpaperCategory);	
		System.out.println("-------------------------");
	}	
}