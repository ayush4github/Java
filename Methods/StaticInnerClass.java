class Outer{
    int x=10;
    static class Inner{
        int y=5;
    }
}
public class StaticInnerClass {
    public static void main(String[] args) {
        Outer.Inner myInner = new Outer.Inner();
        System.out.println(myInner.y); 
    }
}