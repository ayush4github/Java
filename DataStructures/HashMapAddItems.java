import java.util.HashMap;
public class HashMapAddItems {
    public static void main(String[] args) {
        HashMap<String, String> CapitalCities = new HashMap<String, String>();
        CapitalCities.put("England", "London");
        CapitalCities.put("India", "New Delhi");
        CapitalCities.put("Austria", "Vienna");
        CapitalCities.put("Norway", "Oslo");
        CapitalCities.put("Norway", "Oslo");
        CapitalCities.put("USA", "Washington DC");
        System.out.println(CapitalCities);
        System.out.println(CapitalCities.keySet());
        System.out.println(CapitalCities.values());
    }
}   
