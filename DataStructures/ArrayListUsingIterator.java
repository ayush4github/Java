import java.util.*;
public class ArrayListUsingIterator {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        Iterator<String> it = colors.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}