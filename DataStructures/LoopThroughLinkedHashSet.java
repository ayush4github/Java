import java.util.LinkedHashSet;
public class LoopThroughLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<String> cars = new LinkedHashSet<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");
        for ( String car : cars){
            System.out.println(car);
        }
    }
}