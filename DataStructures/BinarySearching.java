import java.util.*;
public class BinarySearching {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Liam");
        names.add("Jenny");
        names.add("Kasper");
        names.add("Angie");
        Collections.sort(names);
        int index = Collections.binarySearch(names, "Angie");
        System.out.println("Angie is at index: " + index);
    }
}
