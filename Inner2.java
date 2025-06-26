package Java2;
class Outer{
long balance = 12345;
class Inner{
    void sbalance(){
        System.out.println(balance);
    }
}

}
public class Inner2 {public static void main(String[] args) {
    
    Outer.Inner i =new Outer().new Inner();
    i.sbalance();
}
}
