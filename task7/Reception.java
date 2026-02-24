class Reception{
	static void book(String patientName,String symptom,String email,long mobile)
	{
		System.out.println("Patient is booking their oppointment");
		System.out.println("Patient Name:"+patientName);
		System.out.println("Symptom:"+symptom);
        System.out.println("Email:"+email);
        System.out.println("Phone Number:"+mobile);
        Hospital.bookAppointment(patientName,symptom);
        System.out.println();		
	}
}