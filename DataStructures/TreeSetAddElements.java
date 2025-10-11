import java.util.TreeSet;
public class TreeSetAddElements {
    public static void main(String[] args) {
        TreeSet<String> cars = new TreeSet<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");
        System.out.println(cars);
    }
}
