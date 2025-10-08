interface Greeting{
    public void sayHello();
}
public class AnonymousFromInterface {
    public static void main(String[] args) {
        Greeting myGreeting = new Greeting(){
            public void sayHello(){
                System.out.println("Hello, World!");
            }
        };
        myGreeting.sayHello();
    }
}
