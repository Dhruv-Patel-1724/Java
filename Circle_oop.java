public class Circle_oop {
    public double redius;
    public double area(){
        return Math.PI*redius*redius;
    }
    public double perimeter(){
        return 2* Math.PI*redius*redius;
    }
    public static void main(String[] args) {
        Circle_oop c = new Circle_oop();
        c.redius=7;
        System.out.println(c.area());
        System.out.println(c.perimeter());
    }
}
