//package IOStreams;
import java.io.FileInputStream;
import java.io.IOException;
public class ReadATextFilePractice {
    public static void main(String[] args) {
        int i;
        try (FileInputStream input = new FileInputStream("filename2.txt")){
            while ((i=input.read())!=-1){
                System.out.print((char)i);
            }
        }
        catch (Exception e){
            System.out.println("Error reading file");
        }
    }
}
