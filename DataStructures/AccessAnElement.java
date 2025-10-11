import java.util.ArrayList;
public class AccessAnElement {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("VOlvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add(0, "Mazda");
        System.out.println(cars.get(0));
    }
}
