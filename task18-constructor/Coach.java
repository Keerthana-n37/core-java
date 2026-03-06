class Coach{
	String name;
	int age;
	String gender;
	int experienceYears;
	boolean isHeadCoach;
	
	Team team;
	Certification certification;
    TrainingSchedule schedule;
    Award award;
    CoachHealth coachHealth;
	
	Coach(String name,int age,String gender,int experienceYears,boolean isHeadCoach,
    Team team,Certification certification,TrainingSchedule schedule,Award award, CoachHealth coachHealth)
	{
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.experienceYears=experienceYears;
		this.isHeadCoach=isHeadCoach;
		this.team=team;
		this.certification=certification;
		this.schedule=schedule;
		this.award=award;
		this.coachHealth=coachHealth;
	}
	
	void display(){
        System.out.println("Coach Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Experience Years: " + experienceYears);
        System.out.println("Head Coach: " + isHeadCoach);

        System.out.println("Team Name: " + team.teamName);
        System.out.println("Team Sport: " + team.sport);

        System.out.println("Certification Name: " + certification.certificateName);
        System.out.println("Certification Year: " + certification.year);

        System.out.println("Schedule Type: " + schedule.scheduleType);
        System.out.println("Sessions Per Week: " + schedule.sessionPerWeek);

        System.out.println("Award Name: " + award.awardName);
        System.out.println("Award Year: " + award.year);

        System.out.println("Health Status: " + coachHealth.status);
        System.out.println("Last Checkup Date: " + coachHealth.lastcheckup);
    }
	
}