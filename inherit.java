 class Test
 {
    public int radius;
    public double area(){
        return Math.PI*radius*radius;
    }
    public double peri(){
        return 2*Math.PI*radius*radius;
    }
}
    class demo extends Test{
        public int hight;
        public double volume()
        {return area()*hight;}
    }
    public class inherit{
    public static void main(String[] args) {
        demo i = new demo();
        i.radius=7;
        i.hight=18;
        System.out.println(i.area());
        System.out.println(i.volume());
        System.out.println(i.peri());
    }
}
 