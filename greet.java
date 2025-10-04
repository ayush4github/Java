public class greet {
    static String greetings(String name){
        return "Hello " + name;
    }
    public static void main(String[]args){
        String message=greetings("Liam");
        System.out.println(message);
    }
}
