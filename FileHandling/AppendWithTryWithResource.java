//package FileHandling;
import java.io.FileWriter;
import java.io.IOException;
public class AppendWithTryWithResource {
    public static void main(String[] args) {
        try(FileWriter myWriter=new FileWriter("filename4.txt", true)){
             myWriter.write("\nAppended text!");
             System.out.println("Successfully appended the file.");
        }
        catch(Exception e){
            System.out.println("An error occured.");
            e.printStackTrace();
        }
    }
}