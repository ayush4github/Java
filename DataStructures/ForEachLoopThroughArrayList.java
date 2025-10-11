import java.util.ArrayList;
public class ForEachLoopThroughArrayList {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add(0, "Mazda");
        int i;
        for (String car : cars ){
            System.out.println(car);
        }
    }
}