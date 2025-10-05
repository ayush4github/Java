//package Classes;

public class This {
    int x;
    public This(int x){
        this.x=x;
    }
    public static void main(String[] args) {
        This myObj = new This(5);
        System.out.println("Value of x is: "+ myObj.x);
    }
}