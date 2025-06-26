package Java2;


@FunctionalInterface
interface LamdaDemo 
{
    public void display(String str);
}
public class Lamdaa{
    public static void main(String[] args) {
        LamdaDemo m = (str)->{System.out.println(str);};
        m.display("Dhruv Patel");
    }
}
    

