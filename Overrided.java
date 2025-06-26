class Demo{
    public void show(){
        System.out.println("my name dhruv");
    }
}
class Demo2 extends Demo{
    public void show(){
        System.out.println("my name is patel");
    }
}
public class Overrided {
    public static void main(String[] args) {
       Demo d = new Demo();
       d.show();
       Demo d1 = new Demo2(); 
       d1.show();
       
    }
}
