//package IOStreams;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class ReadATextLine {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("filename4.txt"))){
            String line;
            while((line = br.readLine())!=null){
                System.out.println(line);
            }
        }
        catch(Exception e){
            System.out.println("Error reading file.");
        }
    }
}