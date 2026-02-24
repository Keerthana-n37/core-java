class Hospital{
    static void bookAppointment(String patientName,String symptom)
	{
		System.out.println("Patient is booking an appointment");
		int bp=120;
		System.out.println("Blood Pressure of patient:"+bp);
		boolean sugar=false;
		System.out.println("Diabetic state of the patient:"+sugar);
		Nurse.basicCheck(patientName,symptom,bp,sugar);
		System.out.println();
	}
} 