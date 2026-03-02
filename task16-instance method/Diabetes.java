class Diabetes
{
	int patientId;
	String name;
	int age;
	String gender;
	double weight;
	double height;
	double bloodSugarFasting;
	double bloodSugarPP;
	double hemoglodinA1c;
	boolean insulinDependent;
	String diagnosisDate;
	String doctorName;
	String hospital;
	String city;
	String state;
	String country;
	boolean regularCheckup;
	String dietPlan;
	String exercisePlan;
	double riskLevel;
	
	Diabetes(int patientId, String name, int age, String gender, double weight,
             double height, double bloodSugarFasting, double bloodSugarPP,
             double hemoglodinA1c, boolean insulinDependent, String diagnosisDate,
             String doctorName, String hospital, String city, String state,
             String country, boolean regularCheckup, String dietPlan,
             String exercisePlan, double riskLevel)
			 {
				 this.patientId=patientId;
				 this.name=name;
				 this.age=age;
				 this.gender=gender;
				 this.weight=weight;
				 this.height=height;
				 this.bloodSugarFasting=bloodSugarFasting;
				 this.bloodSugarPP=bloodSugarPP;
				 this.hemoglodinA1c=hemoglodinA1c;
				 this.insulinDependent=insulinDependent;
				 this.diagnosisDate=diagnosisDate;
				 this.doctorName=doctorName;
				 this.hospital=hospital;
				 this.city=city;
				 this.state=state;
				 this.country=country;
				 this.regularCheckup=regularCheckup;
				 this.dietPlan=dietPlan;
				 this.exercisePlan=exercisePlan;
				 this.riskLevel=riskLevel;
			 }
			 
	void diabetesStatus() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Weight: " + weight);
        System.out.println("Height: " + height);
        System.out.println("Fasting Blood Sugar: " + bloodSugarFasting);
        System.out.println("Postprandial Blood Sugar: " + bloodSugarPP);
        System.out.println("HemoglobnA1c: " + hemoglodinA1c);
        System.out.println("Insulin Dependent: " + insulinDependent);
        System.out.println("Diagnosis Date: " + diagnosisDate);
        System.out.println("Doctor: " + doctorName);
        System.out.println("Hospital: " + hospital);
        System.out.println("City: " + city);
        System.out.println("State: " + state);
        System.out.println("Country: " + country);
        System.out.println("Regular Checkup: " + regularCheckup);
        System.out.println("Diet Plan: " + dietPlan);
        System.out.println("Exercise Plan: " + exercisePlan);
        System.out.println("Risk Level: " + riskLevel);
        System.out.println("----------------------------");
    }		 
}