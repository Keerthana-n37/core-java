import java.io.*;

public class DeserializeExample {
    public static void main(String[] args) throws Exception {

        FileInputStream file = new FileInputStream("student.txt");
        ObjectInputStream object= new ObjectInputStream(file);

        Student student = (Student) object.readObject();

        System.out.println(student.id + " " + student.name);

        object.close();
        file.close();
    }
}