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
class Second {
    public static void main(String[] args) {
        Student myObj = new Student();
        System.out.println("Name: "+myObj.fname);
        System.out.println("Age: "+myObj.age);
        System.out.println("Graduation Year: "+myObj.graduationYear);
        myObj.study();
    }
}
