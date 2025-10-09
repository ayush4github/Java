//package FileHandling;
import java.io.FileWriter;
import java.io.IOException;
public class FileWithTryWithResource {
    public static void main(String[] args) {
        try (FileWriter myWriter = new FileWriter("filename3.txt")){
        myWriter.write("Files in java might be tricky, but it is fun though.");
        System.out.println("Succesfully wrote the file");
    }
    catch(Exception e){
        System.out.println("An error occured.");
        e.printStackTrace();
    }
    }
}
