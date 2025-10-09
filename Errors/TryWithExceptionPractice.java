import java.io.FileOutputStream;
import java.io.IOException;

public class TryWithExceptionPractice {
    public static void main(String[] args) {
        try(FileOutputStream output = new FileOutputStream("filename1.txt")){
            output.write("Hello".getBytes());
            System.out.println("Successfully wrote the file.");
        }
        catch(Exception e){
            System.out.println("Error writing file.");
        }
    }    
}
