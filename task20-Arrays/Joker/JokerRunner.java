class JokerRunner 
{
    public static void main(String[] args) 
	{
        String[] jokes = {"Why so serious?", "I am the Joker!", "Laugh it off"};

        Mask[] masks = new Mask[3];
        masks[0] = new Mask("Clown Mask", 10);
        masks[1] = new Mask("Smiley Mask", 12);
        masks[2] = new Mask("Scary Mask", 8);

        Joker joker = new Joker(jokes, masks);
        joker.display();
    }
}