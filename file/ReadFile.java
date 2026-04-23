import java.io.File;
import java.util.Scanner;

public class ReadFile{

    public static void main(String[] args) throws Exception{

        File file = new File("file.txt");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) 
		{
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }
}