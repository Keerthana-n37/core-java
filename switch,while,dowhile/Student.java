class Student {
    static void attendClass(String name) {
        System.out.println(name + " is attending class");
		submitAssignment(name);
    }
    static void submitAssignment(String name) {
        System.out.println(name + " submitted assignment");
    }
    static void writeExam(String name) {
        System.out.println(name + " is writing exam");
		goHome(name);
    }
    static void goHome(String name) {
        System.out.println(name + " went home");
    }
}
