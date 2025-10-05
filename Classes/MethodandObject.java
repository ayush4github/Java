//package Classes;

public class MethodandObject {
    public void fullThrottle(){
        System.out.println("The car is going at full speed.");
    }
    public void Speed(int maxspeed){
        System.out.println("Max speed is: " + maxspeed);
    }
    public static void main(String[]args){
        MethodandObject myCar = new MethodandObject();
        myCar.fullThrottle();
        myCar.Speed(200);
    }
}
