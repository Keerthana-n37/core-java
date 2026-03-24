class FestivalRunner
{
    public static void main(String[] args)
    {
        Festival[] festivals = new Festival[10];
        FestivalStore festivalStore = new FestivalStore(festivals);

        Festival festival1 = new Festival("Diwali","India","November",5,true,"Sweets");
        Festival festival2 = new Festival("Holi","India","March",2,false,"Gujiya");
        Festival festival3 = new Festival("Christmas","Worldwide","December",1,true,"Cake");
        Festival festival4 = new Festival("Eid","Many Countries","April",1,true,"Biryani");
        Festival festival5 = new Festival("Pongal","India","January",4,false,"Pongal Dish");
        Festival festival6 = new Festival("Navratri","India","October",9,false,"Fasting Food");
        Festival festival7 = new Festival("Onam","India","August",3,false,"Sadya");
        Festival festival8 = new Festival("Ganesh Chaturthi","India","September",10,false,"Modak");
        Festival festival9 = new Festival("New Year","Worldwide","January",1,true,"Party Food");
        Festival festival10 = new Festival("Durga Puja","India","October",5,false,"Traditional Meals");

        festivalStore.saveFestival(festival1);
        festivalStore.saveFestival(festival2);
        festivalStore.saveFestival(festival3);
        festivalStore.saveFestival(festival4);
        festivalStore.saveFestival(festival5);
        festivalStore.saveFestival(festival6);
        festivalStore.saveFestival(festival7);
        festivalStore.saveFestival(festival8);
        festivalStore.saveFestival(festival9);
        festivalStore.saveFestival(festival10);
    }
}