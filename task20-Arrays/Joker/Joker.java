class Joker 
{
    String[] jokes;
    Mask[] masks;

    Joker(String[] jokes, Mask[] masks) {
        this.jokes = jokes;
        this.masks = masks;
    }

    void display() 
	{
        System.out.println("Joker Information:");

        if(this.jokes!= null) 
		{
            System.out.println("Total jokes: "+this.jokes.length);
            for (String joke : jokes) 
			{
                System.out.println("Joke: "+joke);
            }
        } 
		else 
		{
            System.out.println("No jokes available");
        }

        if(this.masks!= null) 
		{
            System.out.println("Total masks: "+this.masks.length);
            for (Mask mask:masks) 
			{
                System.out.println("Mask Type: " +mask.maskType+ " Size: "+ mask.size);
            }
        } 
		else {
            System.out.println("No masks available");
        }
    }
}