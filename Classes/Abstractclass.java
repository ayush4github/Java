abstract class Abstractclass {
    public String fname="John";
    public int age=18;
    public abstract void study();
}
class Student extends Abstractclass{
    public int graduationYear=2018;
    public void study(){
        System.out.println("Studying all day long");
    }
}