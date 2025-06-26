import java.util.Scanner;

public class Fibonaci {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        n = sc.nextInt();
        int a=0,b=1,c;
        System.out.println(a+","+b+",");
        for(int i=0; i<n-2; i++){
            c=a+b;
            System.out.println(c+",");
            a=b;
            b=c;
        }
    }
}
