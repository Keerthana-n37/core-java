class Mobile{
	static void register(String patientName,String symptom,String email,long mobile)
	{
		System.out.println("Patient is registering to the oppointment through mobile");
		Reception.book(patientName,symptom,email,mobile);
		System.out.println();
	}
}