class HospitalRunner {
    public static void main(String[] args) {

        Hospital.patient("Anjali");
        Hospital.patient("Kiran", 40);
        Hospital.patient("Vivek", 32, "Migraine", "Dr. Mehta");

        Hospital.patient("Sahana");
        Hospital.patient("Rohit", 55);
        Hospital.patient("Meera", 28, "Allergy", "Dr. Reddy");

        Hospital.patient(null);
        Hospital.patient("Arun", 0);
        Hospital.patient("Lakshmi", 45, "Diabetes", null);
    }
}
