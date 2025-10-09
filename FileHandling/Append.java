//package FileHandling;
import java.io.FileWriter;
import java.io.IOException;
public class Append {
    public static void main(String[] args) {
        try {
            FileWriter myWriter = new FileWriter("filename4.txt", true);
            myWriter.write("\n Append");
            myWriter.close();
            System.out.println("Successfully wrote the file.");
        }
        catch (Exception e ){
            System.out.println("An error occured.");
        }
    }
}
