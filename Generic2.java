package Java2;

class Demo <T>
{
    T a[ ] = (T[]) new Object[5];
    int length = 0;
    public void append(T v){
        a[length++] = v;
        
    }
    public void display(){
        for(int i = 0;i<length;i++){
            System.out.println(a[i]);
        }
    } 
}
public class Generic2 {
    public static void main(String[] args) {
        Demo <Integer> d = new Demo<>();
        d.append(10);
        d.append(11);
        d.append(12);
        d.append(17);
        d.append(97);
       
        d.display();
    }
}
