import java.util.LinkedList;
public class CreateLinkedList {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        for (int i=0; i<cars.size(); i++){
            System.out.println(cars.get(i));
        }
        for (String car : cars){
            System.out.println(car);
        }
    }
}
