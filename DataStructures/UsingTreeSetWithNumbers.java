import java.util.TreeSet;
public class UsingTreeSetWithNumbers {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<Integer>();
        numbers.add(40);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        for (int n : numbers){
            System.out.println(n);
        }
    }
}
