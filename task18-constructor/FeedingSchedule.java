class FeedingSchedule{
    String schedule;
    FeedingSchedule(String schedule){
        System.out.println("Executing FeedingSchedule Constructor");
        this.schedule = schedule;
    }
	
	void getDetails()
	{
		System.out.println("Aquarium feeding schedule is:"+this.schedule);
	}
}