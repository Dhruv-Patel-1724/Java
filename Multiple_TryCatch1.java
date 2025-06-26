package Java2;
public class Multiple_TryCatch1 {
    public static void main(String[] args) {
        int a[]={12,4,6,0,54};
        try {

            int c=a[2]/a[3];
            System.out.println(c);
            System.out.println(a[5]);
            
        } catch (ArithmeticException e) {
            System.out.println(e);
            // TODO: handle exception
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);

        }
        
    }
}