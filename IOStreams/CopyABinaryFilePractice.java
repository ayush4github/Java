//package IOStreams;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class CopyABinaryFilePractice {
    public static void main(String[] args) {
        int i;
        try (FileInputStream input = new FileInputStream("image2.jpeg");
        FileOutputStream output = new FileOutputStream("copy2.jpeg")){
            while ((i=input.read())!=-1){
                output.write(i);
            }
            System.out.println("File copied successfully.");
        }
        catch (Exception e){
            System.out.println("Error copying file.");
        }
    }
}
