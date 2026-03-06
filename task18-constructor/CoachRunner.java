class CoachRunner {

    public static void main(String[] args) {

        Team team = new Team("Royal Challengers", "Cricket");
        Certification certification = new Certification("Level A", 2018);
        TrainingSchedule schedule = new TrainingSchedule("Morning", 5);
        Award award = new Award("Best Coach", 2022);
        CoachHealth health = new CoachHealth("Good", "12-02-2026");

        Coach coach = new Coach("Rahul", 45, "Male", 20, true,
                team, certification, schedule, award, health);

        coach.display();
    }
}