class Accessmodifiers {
    public String name ="John";
    private int age=30;
}
public class Accessmodifiers2{
    public static void main(String[] args) {
        Accessmodifiers p = new Accessmodifiers();
        System.out.println(p.name);
        System.out.println(p.age);
    }
}
