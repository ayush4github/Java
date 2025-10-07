public class PolymorphismAnimal {
    public void animalSound(){
        System.out.println("The animal makes a sound.");
    }
}
class Pig extends PolymorphismAnimal{
    public void animalSound(){
        System.out.println("The pug says: wee wee");
    }
}
class Dog extends PolymorphismAnimal{
    public void animalSound(){
        System.out.println("The dog says: bow wow");
    }
}
