class Nurse{
     static  void basicCheck(String patientName,String symptom,int bp,boolean sugar)
	 {
		 System.out.println("Nurse doing the basic checkup:");
		 Doctor.treat(patientName,symptom);
		 System.out.println();
	 }
}