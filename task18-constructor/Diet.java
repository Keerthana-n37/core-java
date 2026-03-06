class Diet{
	String foodType;
	int mealsPerDay;
	
	Diet(String foodType,int mealsPerDay)
	{
		this.foodType=foodType;
		this.mealsPerDay=mealsPerDay;
	}
	
	void getDiet()
	{
		System.out.println("Diet Type: " + this.foodType);
        System.out.println("Meals Per Day: " + this.mealsPerDay);
	}
}