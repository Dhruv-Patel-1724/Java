public class Rectengle {
    public double length;
    public double breadth;

    public double area(){
        return length*breadth;
    }
    public double perimeter(){
        return 2*length*breadth;
    }
    public static void main(String[] args) {
        Rectengle r = new Rectengle();
        r.length=10.0;
        r.breadth=12.4;
        System.out.println(r.area());
        System.out.println(r.perimeter());
    }
}
