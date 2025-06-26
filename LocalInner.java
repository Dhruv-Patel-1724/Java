package Java2;
class Outer{
void display()
{
    int a = 5;
    class Inner{
        void show(){

            System.out.println("number is:" +a);
        }
    }
    Inner i = new Inner();
    i.show();

}
}
public class LocalInner {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.display();
    }
}
