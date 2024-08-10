import java.util.Scanner;

class Building{
    int Rooms=10;
    int floors;
    double height;
    String owner;
    String color;
    Building()   
    {
        System.out.println("Building created");
    }
    Building(int r,int f,double h,String o,String c)
    {
        Rooms=r;
        floors=f;
        height=h;
        owner=o;
        color=c;
    }
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

public class Constructor {
    public static void main(String[] args) {
        new Building();
        
        Building b=new Building(10, 3, 1023.56, "Udit", "Grey");
        b.BuildingDetails();
    }
}

