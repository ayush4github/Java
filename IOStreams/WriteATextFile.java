//package IOStreams;
import java.io.FileOutputStream;
public class WriteATextFile {
    public static void main(String[] args) {
        String text="Hello, World!";
        try (FileOutputStream output = new FileOutputStream("filename3.txt")){
            output.write(text.getBytes());
            System.out.println("Successfuly wrote the file.");
        }
        catch (Exception e){
            System.out.println("Error writing the file.");
            e.getStackTrace();
        }
    }
}
