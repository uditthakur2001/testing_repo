// class Mammal{
//         String bloodType;
//         Mammal(){
    
//             System.out.println("Mammal Created");
//             bloodType = "Warm";
//         }
//         void showMammalProperty(){
//             System.out.println("Mammals Property:");
//             System.out.println("Blood Type: "+bloodType);
//         }
//     }
    
    class Cat extends Mammal{
        int legs;
        Cat(){
            System.out.println("Cat Created");

            legs = 4;
        }
        void showCatProperty(){
            System.out.println("Cat Property:");
            System.out.println("Legs: "+legs);
        }
    
    }
    class Leopard extends Cat{
        double speed;
        Leopard(){
            System.out.println("Leopard Created");
            speed = 150.5;
        }
        void showLeopardProperty(){
            System.out.println("Leopard Property:");
            System.out.println("speed: "+speed);
        }
    }
    
    public class MultipleInheritancs {
        // multiple inheritance
        public static void main(String[] args) {
        Cat billi = new Cat();
        Leopard sheer = new Leopard();
        billi.showCatProperty();
        sheer.showLeopardProperty();
        // billi.showCatProperty();
            Mammal whale = new Mammal();
            whale.showMammalProperty();
    
    
        }
    }