//ackage Classes;

public class StaticvsPublic {
    public void myPublicMethod(){
        System.out.println("This method cannot be accessed without object.");
    }
    static void myStaticMethod(){
        System.out.println("This method can be accessed without object.");
    }
    public static void main(String[]args){
        myStaticMethod();
        StaticvsPublic myObj=new StaticvsPublic();
        myObj.myPublicMethod();
    }
}