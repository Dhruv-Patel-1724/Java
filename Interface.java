interface Test{
    void meth1();
    void meth2();
}
class My implements Test{
    public void meth1(){
        System.out.println("it is meth1");
    }
    public void meth2(){
        System.out.println("it is meth2");
    }
    public void meth3(){
        System.out.println("it is meth3");
    }
}
public class Interface {
    public static void main(String[] args) {
        Test t = new My();
        t.meth1();
        t.meth2();
    }
}
