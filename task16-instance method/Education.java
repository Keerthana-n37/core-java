class Education {

    int educationId;
    String studentName;
    String degree;
    String specialization;
    String institutionName;
    String universityName;
    String location;
    int yearOfAdmission;
    int yearOfPassing;
    double percentage;
    double cgpa;
    boolean graduated;
    String modeOfStudy;
    String grade;
    boolean scholarship;
    String skillLearned;
    int totalSubjects;
    String projectTitle;
    double attendancePercentage;
    String status;

    Education(int educationId, String studentName, String degree,
              String specialization, String institutionName,
              String universityName, String location,
              int yearOfAdmission, int yearOfPassing,
              double percentage, double cgpa, boolean graduated,
              String modeOfStudy, String grade, boolean scholarship,
              String skillLearned, int totalSubjects,
              String projectTitle, double attendancePercentage,
              String status) {

        this.educationId = educationId;
        this.studentName = studentName;
        this.degree = degree;
        this.specialization = specialization;
        this.institutionName = institutionName;
        this.universityName = universityName;
        this.location = location;
        this.yearOfAdmission = yearOfAdmission;
        this.yearOfPassing = yearOfPassing;
        this.percentage = percentage;
        this.cgpa = cgpa;
        this.graduated = graduated;
        this.modeOfStudy = modeOfStudy;
        this.grade = grade;
        this.scholarship = scholarship;
        this.skillLearned = skillLearned;
        this.totalSubjects = totalSubjects;
        this.projectTitle = projectTitle;
        this.attendancePercentage = attendancePercentage;
        this.status = status;
    }

    void aboutEducation() {

        System.out.println("Education ID: " + educationId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Degree: " + degree);
        System.out.println("Specialization: " + specialization);
        System.out.println("Institution Name: " + institutionName);
        System.out.println("University Name: " + universityName);
        System.out.println("Location: " + location);
        System.out.println("Year Of Admission: " + yearOfAdmission);
        System.out.println("Year Of Passing: " + yearOfPassing);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("CGPA: " + cgpa);
        System.out.println("Graduated: " + graduated);
        System.out.println("Mode Of Study: " + modeOfStudy);
        System.out.println("Grade: " + grade);
        System.out.println("Scholarship: " + scholarship);
        System.out.println("Skill Learned: " + skillLearned);
        System.out.println("Total Subjects: " + totalSubjects);
        System.out.println("Project Title: " + projectTitle);
        System.out.println("Attendance Percentage: " + attendancePercentage + "%");
        System.out.println("Status: " + status);
        System.out.println("----------------------------");
    }
}