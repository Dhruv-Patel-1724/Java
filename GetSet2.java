public class Privat2 {
    private double redius;

    public double getArea(){
        return redius;
    }
    public void setArea(double a){
        redius = a;
    }
    public double Area(){
        return Math.PI*redius*redius;
    }
    public static void main(String[] args) {
        Privat2 p = new Privat2();
        p.setArea(14.5);
        System.out.println(p.Area());
        System.out.println(p.getArea());
    }
}
