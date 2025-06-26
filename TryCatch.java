package Java2;

public class TryCatch {
    public static void main(String[] args) {
        
        int a=10,b=0,c;
        try {
             c=a/b;
        System.out.println(c);
        } catch (ArithmeticException e) {
            // TODO: handle exception
            System.out.println(e);
        }
       
    }

}
