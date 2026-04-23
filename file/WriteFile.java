import java.io.FileWriter; 

public class WriteFile 
{ 
    public static void main(String[] args) throws Exception 
	{ 
       FileWriter file = new FileWriter("file.txt");
       file.write("Hello World"); 
	   file.close();
       System.out.println("Written successfully"); 
    }
}