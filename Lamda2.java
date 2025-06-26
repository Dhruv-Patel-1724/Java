package Java2;
interface Myadd{
    void display(int a,int b);
}
public class Lamda2 {
    public static void main(String[] args) {
        Myadd d = (a,b)->{ System.out.println(a+b);};
        d.display(220,303);
    }
    
}
