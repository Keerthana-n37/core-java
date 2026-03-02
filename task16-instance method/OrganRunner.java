class OrganRunner{

    public static void main(String[] args) {

        Organ organ1 = new Organ(1,"Heart","Circulatory",300,
                "Pumps blood",true,"Chest",12,8,6,
                "All",false,"Cone","Red",5000,true,
                "None","Cardiologist",98,"Healthy");
        organ1.aboutOrgan();

        Organ organ2 = new Organ(2,"Liver","Digestive",1500,
                "Detoxifies blood",true,"Abdomen",15,10,8,
                "All",false,"Wedge","Brown",8000,true,
                "Fatty Liver","Hepatologist",90,"Good");
        organ2.aboutOrgan();

        Organ organ3 = new Organ(3,"Kidney","Excretory",160,
                "Filters blood",true,"Lower Back",11,6,4,
                "All",true,"Bean","Dark Red",6000,true,
                "Kidney Stone","Nephrologist",92,"Healthy");
        organ3.aboutOrgan();

        Organ organ4 = new Organ(4,"Lungs","Respiratory",1000,
                "Breathing",true,"Chest",25,15,10,
                "All",true,"Spongy","Pink",7000,false,
                "Asthma","Pulmonologist",88,"Moderate");
        organ4.aboutOrgan();

        Organ organ5 = new Organ(5,"Brain","Nervous",1400,
                "Controls body",true,"Head",18,14,12,
                "All",false,"Oval","Gray",9000,false,
                "None","Neurologist",99,"Excellent");
        organ5.aboutOrgan();

        Organ organ6 = new Organ(6,"Stomach","Digestive",500,
                "Digests food",false,"Abdomen",20,12,8,
                "All",false,"J-shaped","Pink",4000,false,
                "Ulcer","Gastroenterologist",85,"Good");
        organ6.aboutOrgan();

        Organ organ7 = new Organ(7,"Pancreas","Digestive",90,
                "Produces insulin",true,"Abdomen",15,5,3,
                "All",false,"Leaf","Yellow",3000,true,
                "Diabetes","Endocrinologist",87,"Stable");
        organ7.aboutOrgan();

        Organ organ8 = new Organ(8,"Spleen","Immune",150,
                "Fights infection",false,"Abdomen",12,7,4,
                "All",false,"Oval","Purple",3500,false,
                "None","Immunologist",89,"Healthy");
        organ8.aboutOrgan();

        Organ organ9 = new Organ(9,"Eyes","Sensory",30,
                "Vision",true,"Face",2.5,2.5,2.5,
                "All",true,"Round","Brown",2000,false,
                "Myopia","Ophthalmologist",93,"Good");
        organ9.aboutOrgan();

        Organ organ10 = new Organ(10,"Skin","Integumentary",4000,
                "Protects body",true,"Whole Body",200,150,2,
                "All",false,"Layered","Varies",10000,false,
                "Allergy","Dermatologist",91,"Healthy");
        organ10.aboutOrgan();
    }
}