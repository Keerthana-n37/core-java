class StatueRunner
{
    public static void main(String[] args)
    {
        Statue[] statues = new Statue[10];
        StatueStore store = new StatueStore(statues);

        Statue statue1 = new Statue("Statue of Liberty","Copper",151,"New York",1886,true);
        Statue statue2 = new Statue("Christ the Redeemer","Concrete",98,"Rio de Janeiro",1931,true);
        Statue statue3 = new Statue("The Thinker","Bronze",6,"Paris",1904,true);
        Statue statue4 = new Statue("Moai","Stone",33,"Easter Island",1450,true);
        Statue statue5 = new Statue("Venus de Milo","Marble",6,"Louvre, Paris",130,true);
        Statue statue6 = new Statue("Sphinx","Limestone",66,"Giza",2500,false);
        Statue statue7 = new Statue("Little Mermaid","Bronze",5,"Copenhagen",1913,true);
        Statue statue8 = new Statue("Genghis Khan Equestrian","Bronze",131,"Mongolia",2008,true);
        Statue statue9 = new Statue("Motherland Calls","Concrete",279,"Volgograd",1967,true);
        Statue statue10 = new Statue("David","Marble",17,"Florence",1504,true);

        store.saveStatue(statue1);
        store.saveStatue(statue2);
        store.saveStatue(statue3);
        store.saveStatue(statue4);
        store.saveStatue(statue5);
        store.saveStatue(statue6);
        store.saveStatue(statue7);
        store.saveStatue(statue8);
        store.saveStatue(statue9);
        store.saveStatue(statue10);
    }
}