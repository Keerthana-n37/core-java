class StoreSingerName
{
	String[] singerNames;
	int currentIndex=0;
	
	StoreSingerName(String[] singerNames)
	{
		this.singerNames=singerNames;
	}
	
	void addSingerName(String singerName)
	{
		System.out.println("Executing addSingerName in StoreSinger");
		System.out.println("Singer name:"+singerName);
		
		if(this.singerNames!= null)
		{
			int index = this.singerNames.length-1;
			System.out.println("Storing the singerName,length of the singerNames array is:"+index);

            if (this.currentIndex <= index) 
		    {
				this.singerNames[this.currentIndex] = singerName; 
				System.out.println("Singer name is stored in index: " + this.currentIndex);
				currentIndex++;
				System.out.println("Storing another singerName in this index: " + this.currentIndex);
            } 
		    else{
                System.out.println("singerNames array is full, cannot store further singerName");
            }
		}
		else{
            System.out.println("singerNames array is null");
        }	
	}
}