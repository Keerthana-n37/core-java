class SaltRunner
{
    public static void main(String[] args)
    {
        Salt[] salts = new Salt[10];
        SaltStore store = new SaltStore(salts);

        Salt salt1 = new Salt("Table Salt","Gujarat", "White", 20, true, "Cooking");
        Salt salt2 = new Salt("Rock Salt","Himachal", "Pink", 40, false, "Fasting Food");
        Salt salt3 = new Salt("Sea Salt","Goa", "White", 35, true, "Cooking");
        Salt salt4 = new Salt("Black Salt","Uttar Pradesh", "Black", 50, false, "Chaat");
        Salt salt5 = new Salt("Himalayan Salt","Punjab", "Pink", 80, false, "Health Use");
        Salt salt6 = new Salt("Iodized Salt","Tamil Nadu", "White", 25, true, "Daily Cooking");
        Salt salt7 = new Salt("Crystal Salt","Rajasthan", "White", 30, false, "Pickles");
        Salt salt8 = new Salt("Organic Salt","Kerala", "Off White", 60, true, "Healthy Cooking");
        Salt salt9 = new Salt("Fine Salt","Andhra Pradesh", "White", 22, true, "Kitchen Use");
        Salt salt10 = new Salt("Natural Salt","Odisha", "White", 28, false, "Food Processing");

        store.saveSalt(salt1);
        store.saveSalt(salt2);
        store.saveSalt(salt3);
        store.saveSalt(salt4);
        store.saveSalt(salt5);
        store.saveSalt(salt6);
        store.saveSalt(salt7);
        store.saveSalt(salt8);
        store.saveSalt(salt9);
        store.saveSalt(salt10);
    }
}