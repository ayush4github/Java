import java.util.Set;
import java.util.HashSet;
public class SetInterface {
    public static void main(String[] args) {
        Set<String> cars = new HashSet<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
    }
}
