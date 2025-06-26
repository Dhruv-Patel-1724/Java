abstract class animal{
    public abstract void Eat();
    String name;
    animal(String name){
        System.out.println("anima cons"+name);
    }
}
class Dog extends animal{
    Dog(){
        super("Dhruv");
        System.out.println("ok dog constroctor");
    }
    public void Eat(){
        System.out.println("Eat a vagitable");
    }
}
class Cat extends animal{
     Cat() {
        super("Simmi");
        System.out.println("ok cat constructor");
    }
public void Eat(){
    System.out.println("Eating both type of food");
}
}
public class Abstract2 {
    public static void main(String[] args) {
        Cat c =new Cat();
        Dog d = new Dog();
        c.Eat();
        d.Eat();
        
    }
}
