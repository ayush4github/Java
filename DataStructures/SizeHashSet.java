    import java.util.HashSet;
    public class SizeHashSet{
        public static void main(String[] args) {
            HashSet<String> cars = new HashSet<String>();
            cars.add("Volvo");
            cars.add("BMW");
            cars.add("Ford");
            cars.add("BMW");
            cars.add("Mazda");
            System.out.println(cars);
            int x = cars.size();
            System.out.println(x);
        }
    }