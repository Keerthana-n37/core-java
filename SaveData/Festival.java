class Festival
{
    String festivalName;
    String country;
    String month;
    int numberOfDays;
    boolean nationalHoliday;
    String mainFood;

    Festival(String festivalName,String country,String month,int numberOfDays,boolean nationalHoliday,String mainFood)
    {
        this.festivalName = festivalName;
        this.country = country;
        this.month = month;
        this.numberOfDays = numberOfDays;
        this.nationalHoliday = nationalHoliday;
        this.mainFood = mainFood;
    }

    void showFestivalDetails()
    {
        System.out.println("Executing showFestivalDetails in Festival");
        System.out.println("Festival Name: " + this.festivalName);
        System.out.println("Country: " + this.country);
        System.out.println("Month Celebrated: " + this.month);
        System.out.println("Number of Days: " + this.numberOfDays);
        System.out.println("Is National Holiday: " + this.nationalHoliday);
        System.out.println("Main Food: " + this.mainFood);
        System.out.println("---------------------------");
    }
}