//package FileHandling;
import java.io.File;
public class GetFileInformation {
    public static void main(String[] args) {
        File myObj = new File("filename2.txt");
        if (myObj.exists()){
            System.out.println("Filename: "+myObj.getName());
            System.out.println("Length of the file in bytes: "+myObj.length());
            System.out.println("Absolute path: "+myObj.getAbsolutePath());
            System.out.println("Writable: "+ myObj.canWrite());
            System.out.println("Readable: "+myObj.canRead());
        }
        else {
            System.out.println("The file does not exists.");
        }
    }
}
