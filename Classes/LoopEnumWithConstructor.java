enum Level{
    LOW("Low Level"),
    MEDIUM("Medium Level"),
    HIGH("High Level");
    private String description;
    private Level(String description){
        this.description=description;
    }
    public String getDescription(){
        return description;
    }
}
public class LoopEnumWithConstructor {
    public static void main(String[] args) {
        for (Level myVar: Level.values()){
            System.out.println(myVar+" : "+myVar.getDescription());
        }
    }
}
