class TrainingSchedule{
	String scheduleType;
	int sessionPerWeek;
	
	TrainingSchedule(String scheduleType,int sessionPerWeek)
	{
		this.scheduleType=scheduleType;
		this.sessionPerWeek=sessionPerWeek;
	}
	
	void getTrainingSchedule()
	{
		System.out.println("Schedule Type: " + this.scheduleType);
        System.out.println("Sessions Per Week: " + this.sessionPerWeek);
	}
}