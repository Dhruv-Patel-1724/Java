class car{
    public void Start(){
        System.out.println("car is start");
    }
    public void stop(){
        System.out.println("car is stop");
    }
    public void Changegear(){
        System.out.println(" change gear");
    }
}
class Lcar extends car{
    public void Changegear(){
        System.out.println("auto change gear");
    }
    public void roof(){
        System.out.println("sun roof");
    }
}
public class Override2 {
    public static void main(String[] args) {
        Lcar l = new Lcar();
        l.Start();
        l.stop();
        l.Changegear();
        car c = new car();
        c.Changegear();
        car c1= new Lcar();
        c1.stop();
        c1.Changegear();
    }
}
