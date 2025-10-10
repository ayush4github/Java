//package IOStreams;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
public class WriteToATextFile {
    public static void main(String[] args) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("filename5.txt"))){
            bw.write("First Line");
            bw.newLine();
            bw.write("SecondLine");
            System.out.println("Succesfully wrote the file.");
        }
        catch(Exception e){
            System.out.println("Error writing file.");
        }
    }
}
