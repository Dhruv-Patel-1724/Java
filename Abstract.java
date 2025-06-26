abstract class Car{
    public abstract void drive();
    public void Music(){
        System.out.println("Play the music");
    }
}
class Car2 extends Car{
    public void drive(){
System.out.println("Yes i was drive car");
    }
}
class Car3 extends Car2{
    public void drive(){
System.out.println("Yes i was drive car please give me a key");
    }
}
public class Abstract {
    
    public static void main(String[] args) {
        Car c = new Car3();
        Car c1 = new Car2();
        c.Music();
        c.drive();
        c1.drive();
    }
}
