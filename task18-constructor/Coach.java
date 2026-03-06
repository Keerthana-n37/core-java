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
	
	void displayCoach(){
		System.out.println("Coach details....")
        System.out.println("Coach Name: " +this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Gender: " + this.gender);
        System.out.println("Experience Years: " + this.experienceYears);
        System.out.println("Head Coach: " + this.isHeadCoach);
		
		if(this.team!=null)
		{
			this.team.getTeam();
		}
		else{
			System.out.println("Team is not there");
		}
		
		if(this.certification!=null)
		{
			this.certification.getCertification();
		}
		else{
			System.out.println("Certification is not there");
		}
		
		if(this.schedule!=null)
		{
			this.schedule.getTrainingSchedule();
		}
		else{
			System.out.println("Training schedule is not there");
		}
		
		if(this.award!=null)
		{
			this.award.getAward();
		}
		else{
			System.out.println("Award is not there");
		}
		
		if(this.coachHealth!=null)
		{
			this.coachHealth.getCoachHealth();
		}
		else{
			System.out.println("CoachHealth is not there");
		}
    }
	
}