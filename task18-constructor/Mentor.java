class Mentor{
    String mentorName;

    Mentor(String mentorName) {
        System.out.println("Executing Mentor Constructor");
        this.mentorName = mentorName;
    }
	
	void getMentor()
	{
		System.out.println("Mentor name is:"+this.mentorName);
	}
}