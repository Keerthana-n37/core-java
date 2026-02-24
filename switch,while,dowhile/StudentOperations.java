class StudentOperations {

    public static void main(String[] args) {
        int exam = 1;
        int period = 1;
        while (period <= 4) {
            Student.attendClass("Anjali");
            period++;
        }
        do {
            Student.writeExam("Anjali");
            exam++;
        } while (exam <= 2);
    }
}
