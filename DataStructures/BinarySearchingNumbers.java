import java.util.*;
public class BinarySearchingNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(1);
        numbers.add(7);
        numbers.add(3);
        numbers.add(9);
        Collections.sort(numbers);
        System.out.println(numbers);
    }
}
