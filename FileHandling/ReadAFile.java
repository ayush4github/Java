//package FileHandling;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class ReadAFile {
    public static void main(String[] args) {
        File myObj = new File("filename2.txt");
        try (Scanner myReader = new Scanner(myObj)){
            while (myReader.hasNextLine()){
                String data=myReader.nextLine();
                System.out.println(data);
            }
        }
        catch(FileNotFoundException e){
            System.out.println("An error occured");
            e.getStackTrace();
        }
    }
}