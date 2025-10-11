import java.util.ArrayList;
public class ArrayListSize {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add(0, "Mazda");
        System.out.println(cars);
        int x = cars.size();
        System.out.println(x);
        cars.remove(2);
        System.out.println(cars);
        int y = cars.size();
        System.out.println(y);
    }
}
