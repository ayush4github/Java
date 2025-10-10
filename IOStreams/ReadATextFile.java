//package IOStreams;
import java.io.FileInputStream;
import java.io.IOException;
public class ReadATextFile {
    public static void main(String[] args) {
        try(FileInputStream input = new FileInputStream("filename2.txt")){
            int i;
            while ((i=input.read())!=-1){
                System.out.print((char)i);
            }
        }
        catch (Exception e){
            System.out.println("Error reading file.");
        }

    }
}
