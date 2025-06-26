class Rectangle{
    int hight;
    int breadth;
//     Rectangle(){
// hight=breadth=1;
//     }
    Rectangle(int h ,int b){
hight=h;
breadth=b;
    }
}
class Cube extends Rectangle{
    int length;
    // Cube(){
    //     length=1;
    // }
    Cube(int l,int h, int b){
        super( h, b);
        length = l;
    }
    int volume(){
        return length*hight*breadth;
    }
}
public class Cos {

    public static void main(String[] args) {
       
        Cube c1 = new Cube(10,20,30);
        
        System.out.println(c1.volume());

    }
}
