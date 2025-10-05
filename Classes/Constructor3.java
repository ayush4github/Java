//package Classes;

public class Constructor3 {
    int modelYear;
    String modelName;
    public Constructor3(int year, String name){
        modelYear=year;
        modelName=name;
    }
    public static void main(String[] args) {
        Constructor3 myObj =new Constructor3(1969, "Mustang");
        System.out.println("ModelYear: "+ myObj.modelYear+ " ModelName: "+ myObj.modelName);
    }
}
