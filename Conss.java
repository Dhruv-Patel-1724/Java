class Area{
    double radius;
        Area(){
            radius=1;
        }
        Area(double r){
            radius=r;
        }
        double Area1(){
            return Math.PI*radius*radius;
        }
    }
    class Cylinder extends Area{
        int hight;
        Cylinder(){
            hight=1;
        }
        Cylinder(int h,double r){
            super(r);
            hight = h;
        }
        double CylinderArea(){
            return Area1()*hight;
        }
    }

public class Conss {
    public static void main(String[] args) {
        Cylinder c = new Cylinder(10,45);
        System.out.println(c.Area1());
        System.out.println(c.CylinderArea());
    }
}
