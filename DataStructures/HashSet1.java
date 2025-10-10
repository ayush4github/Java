//package IOStreams;
import java.util.HashSet;
public class HashSet1 {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");
        System.out.println(cars);
    }
}
