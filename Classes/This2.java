public class This2 {
    int modelYear;
    String modelName;
    public This2(String modelName){
        this(2020, modelName);
    }
    public This2(int modelYear, String modelName){
        this.modelYear=modelYear;
        this.modelName=modelName;
    }
    public void printInfo(){
        System.out.println(modelYear+ " " + modelName);
    }
    public static void main(String[] args) {
        This2 car1=new This2("Corvette");
        This2 car2=new This2(1969, "Mustang");
        car1.printInfo();
        car2.printInfo();
    }
}
