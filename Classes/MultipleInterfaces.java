interface FirstInterface{
    public void FirstMethod();
}
interface SecondInterface{
    public void SecondMethod();
}
class DemoClass implements FirstInterface, SecondInterface{
    public void FirstMethod(){
        System.out.println("Some text...");
    }
    public void SecondMethod(){
        System.out.println("Some other text...");
    }
}
public class MultipleInterfaces {
    public static void main(String[] args) {
        DemoClass myObj = new DemoClass();
        myObj.FirstMethod();
        myObj.SecondMethod();
    }
}
