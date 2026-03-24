class Statue
{
    String statueName;
    String material;
    double heightInFeet;
    String location;
    int builtYear;
    boolean attractive;

    Statue(String statueName, String material, double heightInFeet, String location, int builtYear, boolean attractive)
    {
        this.statueName= statueName;
        this.material= material;
        this.heightInFeet= heightInFeet;
        this.location= location;
        this.builtYear= builtYear;
        this.attractive= attractive;
    }

    void displayStatueDetails()
    {
        System.out.println("Executing displayStatueDetails in Statue");
        System.out.println("Statue Name: " +this.statueName);
        System.out.println("Material: " +this.material);
        System.out.println("Height of statue: " +this.heightInFeet);
        System.out.println("Location: " +this.location);
        System.out.println("Built year: " +this.builtYear);
        System.out.println("Is attractive for tourist: " +this.attractive);
        System.out.println("-----------------------------");
    }
}