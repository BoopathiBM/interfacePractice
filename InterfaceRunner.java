interface Flyable {
    void fly();
}

class Bird implements Flyable{

    public void fly() {
        System.out.println("wings");
    }    
}
class Aeroplane implements Flyable{

    public void fly() {
        System.out.println("fuel");
    }    
}


public class InterfaceRunner {
    public static void main(String[] args){
        Flyable[] flyingObjects = {new Bird(), new Aeroplane()};
        for(Flyable object : flyingObjects){
            object.fly();
        }

    } 
} 