class CourseRunner {
    public static void main(String[] args) {

        OnlineCourse c1 = new OnlineCourse();
        System.out.println("Course Name: " + c1.courseName);
        System.out.println("Instructor: " + c1.instructor);
        System.out.println("Duration in weeks: " + c1.durationWeeks);
        System.out.println("Fee: " + c1.fee);
        System.out.println("Re-initialising course details");
        c1.courseName = "Java Full Stack"; 
		c1.instructor = "Ravi"; 
		c1.durationWeeks = 12; 
		c1.fee = 25000;
        System.out.println("Course Name: " + c1.courseName);
        System.out.println("Instructor: " + c1.instructor);
        System.out.println("Duration in weeks: " + c1.durationWeeks);
        System.out.println("Fee: " + c1.fee);
        System.out.println("------------------------------");

        OnlineCourse c2 = new OnlineCourse();
		System.out.println("Course Name: " + c2.courseName);
        System.out.println("Instructor: " + c2.instructor);
        System.out.println("Duration in weeks: " + c2.durationWeeks);
        System.out.println("Fee: " + c2.fee);
        System.out.println("Re-initialising course details");
        c2.courseName = "Python";
		c2.instructor = "Sneha";
		c2.durationWeeks = 10; 
		c2.fee = 20000;
        System.out.println("Course Name: " + c2.courseName);
        System.out.println("Instructor: " + c2.instructor);
        System.out.println("Duration in weeks: " + c2.durationWeeks);
        System.out.println("Fee: " + c2.fee);
        System.out.println("------------------------------");

        OnlineCourse c3 = new OnlineCourse();
		System.out.println("Course Name: " + c3.courseName);
        System.out.println("Instructor: " + c3.instructor);
        System.out.println("Duration in weeks: " + c3.durationWeeks);
        System.out.println("Fee: " + c3.fee);
        System.out.println("Re-initialising course details");
        c3.courseName = "AWS Cloud";
		c3.instructor = "Kiran"; 
		c3.durationWeeks = 8;
		c3.fee = 30000;
        System.out.println("Course Name: " + c3.courseName);
        System.out.println("Instructor: " + c3.instructor);
        System.out.println("Duration in weeks: " + c3.durationWeeks);
        System.out.println("Fee: " + c3.fee);
        System.out.println("------------------------------");

        OnlineCourse c4 = new OnlineCourse();
		System.out.println("Course Name: " + c4.courseName);
        System.out.println("Instructor: " + c4.instructor);
        System.out.println("Duration in weeks: " + c4.durationWeeks);
        System.out.println("Fee: " + c4.fee);
        System.out.println("Re-initialising course details");
        c4.courseName = "React JS"; 
		c4.instructor = "Anil"; 
		c4.durationWeeks = 6; 
		c4.fee = 18000;
        System.out.println("Course Name: " + c4.courseName);
        System.out.println("Instructor: " + c4.instructor);
        System.out.println("Duration in weeks: " + c4.durationWeeks);
        System.out.println("Fee: " + c4.fee);
        System.out.println("------------------------------");

        OnlineCourse c5 = new OnlineCourse();
		System.out.println("Course Name: " + c5.courseName);
        System.out.println("Instructor: " + c5.instructor);
        System.out.println("Duration in weeks: " + c5.durationWeeks);
        System.out.println("Fee: " + c5.fee);
        System.out.println("Re-initialising course details");
        c5.courseName = "Data Science"; 
		c5.instructor = "Divya"; 
		c5.durationWeeks = 14; 
		c5.fee = 40000;
        System.out.println("Course Name: " + c5.courseName);
        System.out.println("Instructor: " + c5.instructor);
        System.out.println("Duration in weeks: " + c5.durationWeeks);
        System.out.println("Fee: " + c5.fee);
        System.out.println("------------------------------");
    }
}