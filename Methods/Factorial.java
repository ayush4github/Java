public class Factorial {
    public static int factorial(int x){
        if (x>1){
            return x * factorial(x-1);
        }
        else {
            return 1;
        }
    }
    public static void main(String[]args){
        int result = factorial(10);
        System.out.println("Factorial of 5 is " + result);
    }
}
