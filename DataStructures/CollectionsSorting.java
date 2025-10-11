//package IOStreams;
import java.util.ArrayList;
import java.util.Collections;
public class CollectionsSorting {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");
        Collections.sort(cars);
        System.out.println(cars);
    }
}