public class Methodoverloading {
    static int plusMethod(int x, int y){
        return x+y;
    }
    static double plusMethod(double x, double y){
        return x+y;
    }
    public static void main(String[]args){
        int num1=plusMethod(3, 4);
        double num2=plusMethod(3.2, 4.5);
        System.out.println("int "+num1);
        System.out.println("double "+num2);
    }
    
}
