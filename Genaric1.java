package Java2;
class Demo<T>{
    private T object;
    void setShow(T v){
        object=v;

    }
    public T GetShow(){
        return object;
    }
}
public class Genaric1 {
    public static void main(String[] args) {
        Demo<Integer> d = new Demo<>();
        d.setShow(34);
        System.out.println(d.GetShow());
    }
}
