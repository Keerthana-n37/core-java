class GumRunner
{
    public static void main(String[] args)
    {
        Gum[] gums = new Gum[10];
        GumStore store = new GumStore(gums);

        Gum gum1 = new Gum("Minty Fresh","Mint",20,true,10,"Green");
        Gum gum2 = new Gum("Sweet Chew","Strawberry",15,false,8,"Red");
        Gum gum3 = new Gum("Cool Mint","Mint",25,true,12,"Light Green");
        Gum gum4 = new Gum("Bubble Joy","Bubblegum",18,false,9,"Pink");
        Gum gum5 = new Gum("Fruit Blast","Orange",20,false,10,"Orange");
        Gum gum6 = new Gum("Sugarless Mint","Mint",22,true,15,"Green");
        Gum gum7 = new Gum("Berry Delight","Berry",20,false,10,"Purple");
        Gum gum8 = new Gum("Choco Mint","Chocolate Mint",25,true,10,"Brown");
        Gum gum9 = new Gum("Lemon Fresh","Lemon",18,true,8,"Yellow");
        Gum gum10 = new Gum("Tutti Fruity","Mixed Fruit",20,false,10,"Multicolor");

        store.saveGum(gum1);
        store.saveGum(gum2);
        store.saveGum(gum3);
        store.saveGum(gum4);
        store.saveGum(gum5);
        store.saveGum(gum6);
        store.saveGum(gum7);
        store.saveGum(gum8);
        store.saveGum(gum9);
        store.saveGum(gum10);
    }
}