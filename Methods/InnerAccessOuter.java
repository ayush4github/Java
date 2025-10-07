class OuterClass{
    int x=5;
    class InnerClass{
        public int myInnerMethod(){
            return x;
        }
    }
}
public class InnerAccessOuter {
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.myInnerMethod());
    }
}