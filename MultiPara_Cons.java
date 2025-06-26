public class Cy {
    private int hight;
    private int radius;

    public  Cy(){
        hight=radius=1;
    }
    public Cy(int h,int r){
        hight=h;
        radius=r;
    }
    public int getHight(){
        return hight;
    }
    public int getRadius(){
        return radius;
    }
    public void setHeight(int h){
        if(h>=0)
        hight=h;
        else
        hight=0;
    }
    public void setRadius(
        int r){
        if(r>=0)
        radius=r;
        else
        radius=0;

    }
    public double radius(){
        return Math.PI*radius*radius;
    }
    public double volume(){
        return radius()*hight;
    }
    public static void main(String[] args) {
        Cy c =new Cy();
        c.setHeight(15);
        c.setRadius(10);
        System.out.println(c.volume());
        System.err.println(c.radius());
    }
}
