class Scanner
{
    short[] scanSpeeds;
    Document[] documents;

    Scanner(short[] scanSpeeds, Document[] documents) 
	{
        this.scanSpeeds = scanSpeeds;
        this.documents = documents;
    }

    void display() 
	{
        System.out.println("Scanner Information:");

        if(this.scanSpeeds!= null) 
		{
            System.out.println("Total scan speeds: " + this.scanSpeeds.length);
            for (short speed : scanSpeeds) 
			{
                System.out.println("Scan Speed: " + speed);
            }
        } 
		else{
            System.out.println("No scan speeds available");
        }

        if(this.documents!= null) 
		{
            System.out.println("Total documents: " + this.documents.length);
            for (Document doc : documents) 
			{
                System.out.println("Document Title: " + doc.title + " Pages: " + doc.pages);
            }
        }
		else{
            System.out.println("No documents available");
        }
    }
}