class Mammal{
    String bloodType;
    Mammal(){

        System.out.println("Mammal Created");
        bloodType = "Warm";
    }
    void showMammalProperty(){
        System.out.println("Mammals Property:");
        System.out.println("Blood Type: "+bloodType);
    }
}

class Human extends Mammal{
    int legs;
    Human(){
        System.out.println("Human Created");
        legs = 2;
    }
    void showHumanProperty(){
        System.out.println("Human Property:");
        System.out.println("Legs: "+legs);
    }

}

public class Inheritance {
    // single inheritance
    public static void main(String[] args) {
    Human udit = new Human();
    udit.showMammalProperty();
    udit.showHumanProperty();
        Mammal whale = new Mammal();
        whale.showMammalProperty();


    }
}
