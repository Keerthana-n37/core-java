class StudentResult{
    public static void main(String[] args) {
        startResult();
    }

    static void startResult() {
        int marks = getMarks();
        evaluateMarks(marks);
        checkingSubject();
        recheckingPaper();
        sendingResult();
    }

    static void evaluateMarks(int marks) {

        if (isPass(marks)) {
            System.out.println("Student Passed");
        }
        if (marks >= 75) {
            System.out.println("Distinction");
        } 
		else {
            System.out.println("No Distinction");
        }

        checkGrade(marks);

        if (isPass(marks)) {
            if (marks >= 90) {
               System.out.println("Top Performer");
            }
        }
    }

    static void checkGrade(int marks) {
        if (marks >= 90) 
		{
			System.out.println("Grade A");
		}
        else if (marks >= 75)
		{	
	        System.out.println("Grade B");
		}
        else 
		{
			System.out.println("Grade C");
		}
    }

    static void checkingSubject() {
        for (int i = 1; i <= 3; i++)
            System.out.println("Checking Subject " + i);
    }

    static void recheckingPaper() {
        int i = 1;
        while (i <= 2) {
            System.out.println("Rechecking Paper " + i);
            i++;
        }
    }
	
    static void sendingResult() {
        int i = 1;
        do {
            System.out.println("Sending Result SMS " + i);
            i++;
        } while (i <= 2);
    }

    static int getMarks()
	{ 
	      return 85;
	}
    static boolean isPass(int m)
	{ 
	       if(m >= 35){
			   System.out.println("Marks"+m); 
			   return true;
		   }
		   else{
			   return false;
		    }
    }
}
