//package Errors;

public class FinallyStatement {
    public static void main(String[] args) {
        int[] myNumbers={1, 2, 3};
        try {
            System.out.println(myNumbers[10]);
        }
        catch(Exception e){
            System.out.println("Something went wrong.");
        }
        finally {
            System.out.println("The 'try and catch' is finished.");
        }
    }
}