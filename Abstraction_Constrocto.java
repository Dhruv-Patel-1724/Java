public class ConArea {
    private double length;
    private double breadth;

    public ConArea(){
        length=1;
        breadth=1;
    }
    public ConArea(double l,double b){
length=l;
breadth=b;
    }
    public ConArea(double s){
        length=breadth=s;
    }
    public double getLength(){
        return length;
    }
    public double getBreadth(){
        return breadth;
    }
    public void setLength(double l){
        if(l>=0)
        length=l;
        else
        length=0;
    }
    public void setBreadth(double b){
        if(b>=0)
        breadth=b;
        else
        breadth=0;
    }
    public double Area(){
        return length*breadth;
    }
    public static void main(String[] args) {
        ConArea c = new ConArea(12,12);
        System.out.println(c.Area());

    }
}
