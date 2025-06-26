package Java2;
class Outer{
    void display(){
        Runnable r = new Runnable() {
            public void run(){
                int a = 10;
                int b =20,c;
                System.out.println(c=(a+b));
            }
        };
        r.run();
    }
}
public class Anonymous2 {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.display();
    }
}
