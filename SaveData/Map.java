class Map
{
	String mapName;
	String regionCovered;
	String mapCategory;
	double zoomLevel;
	int releaseYear;
	boolean laminated;
	
	Map(String mapName,String regionCovered,String mapCategory,double zoomLevel,int releaseYear,boolean laminated)
	{
		this.mapName=mapName;
		this.regionCovered=regionCovered;
		this.mapCategory=mapCategory;
		this.zoomLevel=zoomLevel;
		this.releaseYear=releaseYear;
		this.laminated=laminated;
	}
	
	void displayMapDetails()
	{
		System.out.println("Executing displayMapDetails in map");
		System.out.println("Map name:"+this.mapName);
		System.out.println("Region covered in map:"+this.regionCovered);
		System.out.println("Map category:"+this.mapCategory);
		System.out.println("Map zoom level:"+this.zoomLevel);
		System.out.println("Map releaseYear:"+this.releaseYear);
		System.out.println("Is map laminated:"+this.laminated);
		System.out.println("----------------------------");
	}
}