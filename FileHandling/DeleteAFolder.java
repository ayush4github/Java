//package FileHandling;
import java.io.File;
public class DeleteAFolder {
    public static void main(String[] args) {
        File myObj = new File("C:\\Users\\Ayush\\Desktop\\Java\\FileHandling\\TestFolder");
        if (myObj.delete()){
            System.out.println("Deleted the folder: "+myObj.getName());
        }
        else {
            System.out.println("Failed to delete the folder.");
        }
    }
}
