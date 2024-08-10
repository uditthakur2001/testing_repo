class Building{
    int Rooms=10;
    int floors;
    double height;
    String owner;
    String color;

    void manageInfra(){
        System.out.println("Managing Building Infra");
    }

    void BuildingDetails(){
        System.out.println("******** Building Details ********:");
        System.out.println("Number of Rooms: "+ Rooms);
        System.out.println("Number of Floors: "+ floors);
        System.out.println("Height: "+ height);
        System.out.println("Owner: "+ owner);
        System.out.println("Color: "+ color);
    }

}

public class BuildingHandler {

    public static void main(String[] args) {
        Building building = new Building();

        building.color = "white";
        building.BuildingDetails();
        // System.out.println(building);
    }
}