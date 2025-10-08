class Animal{
    Animal(){
        System.out.println("Animal is created");
    }
}
class Dog extends Animal{
    Dog(){
        super();
        System.out.println("Dog is created");
    }
}
public class Super2 {
    public static void main(String[] args) {
        Dog myDog = new Dog();   
    }
}