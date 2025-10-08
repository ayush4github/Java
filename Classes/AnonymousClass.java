class Animal{
    public void animalSound(){
        System.out.println("The animal makes a sound.");
    }
}
public class AnonymousClass {
    public static void main(String[] args) {
        Animal myAnimal = new Animal(){
            public void animalSound(){
                System.out.println("Woof Woof");
            }
        };
        myAnimal.animalSound();
    }
}
