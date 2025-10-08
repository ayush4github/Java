import java.util.Scanner;
public class JavaUserInput1 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter username, age, salary: ");
        String name =myObj.nextLine();
        int age = myObj.nextInt();
        double salary = myObj.nextDouble();
        System.out.println("Username is : "+ name);
        System.out.println("Age is: " + age );
        System.out.println("Salary is: "+salary);
    }
}
