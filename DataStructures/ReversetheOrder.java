    import java.util.ArrayList;
    import java.util.Collections;
    public class ReversetheOrder{
        public static void main(String[] args) {
            ArrayList <String> cars = new ArrayList<String>();
            cars.add("Volvo");
            cars.add("BMW");
            cars.add("Ford");
            cars.add("Mazda");
            Collections.sort(cars, Collections.reverseOrder());
            for (String i : cars){
                System.out.println(i);
            }
        }
    }