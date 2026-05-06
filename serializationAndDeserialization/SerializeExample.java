public class SerializeExample {
    public static void main(String[] args) throws Exception {
        Student student = new Student(1,"Arun");

        FileOutputStream file = new FileOutputStream("student.txt");
        ObjectOutputStream object = new ObjectOutputStream(file);

        object.writeObject(student);

        object.close();
        file.close();

        System.out.println("Serialization Done");
    }
}