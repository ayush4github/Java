import java.util.ArrayList;
public class LoopThroughArrayList {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add(0, "Mazda");
        int i;
        for (i=0; i<cars.size(); i++){
            System.out.println(cars.get(i));
        }
    }
}
