package Java2;

class Outer{
    public void display(){
        Runnable r = new Runnable() {
            public void run(){
            System.out.println("Hello");
            }
        };
        r.run();
    }
}
public class Anonymous {
    public static void main(String[] args) {
        Outer r =new Outer();
        r.display();
    }
}
