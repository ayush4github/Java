enum Level{
    LOW("Low Level"),
    MEDIUM("Medium Level"),
    HIGH("High Level");
    private String description;
    private Level(String description){
        this.description=description;
    }
    public String getdescription(){
        return description;
    }
}
public class EnumConstructorPractice {
    public static void main(String[] args) {
        Level myVar = Level.MEDIUM;
        System.out.println(myVar.getdescription());
    }
}
