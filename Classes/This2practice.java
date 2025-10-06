public class This2practice {
    int modelYear;
    String modelName;
    public This2practice(String modelName){
        this(2020, modelName);
    }
    public This2practice(int modelYear, String modelName){
        this.modelYear=modelYear;
        this.modelName=modelName;
    }
    public void printInfo(){
        System.out.println(modelYear+" "+modelName);
    }
    public static void main(String[] args) {
        This2practice car1=new This2practice("Corvette");
        This2practice car2=new This2practice(1696, "Mustang");
        car1.printInfo();
        car2.printInfo();
    }
}
