class Animal{
    String type="Animal";
}
class Dog extends Animal{
    String type="Dog";
    public void printType(){
        System.out.println(super.type);
    }
}
public class Super1 {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.printType();
    }
}
