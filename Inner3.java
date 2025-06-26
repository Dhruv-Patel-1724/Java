package Java2;
class Animal{
    class Dog{
        int leg = 4;
        void Sound(){
            System.out.println("Wah it is bark");
        }
    }
}
public class Inner3 {
    public static void main(String[] args) {
        Animal.Dog d = new Animal().new Dog();
        System.out.println(d.leg);
        d.Sound();
        
    }

    
}
