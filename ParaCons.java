class Parant{
    Parant(){
        System.out.println("non para constructoe");
    }
    Parant(int i){
        System.out.println("para constroctor");
    }
}
class Child extends Parant{
     Child(){
        System.out.println("non para child constructoe");
    }
    Child(int y){
        super(y);
        System.out.println("para child constroctor");
    }
}
public class ParaCons {
    public static void main(String[] args) {
        Child c = new Child();
        Child c1 = new Child(45);
    }
}
