public class PolymorphismMain {
    public static void main(String[] args) {
        PolymorphismAnimal myAnimal = new PolymorphismAnimal();
        PolymorphismAnimal myPig = new Pig();
        PolymorphismAnimal myDog = new Dog();
        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
}
}