import java.util.Scanner;

public class Ap_Series {
    public static void main(String[] args) {
        int a,d,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a,d and n: ");
        a = sc.nextInt();
        d = sc.nextInt();
        n = sc.nextInt();
        int term = a;
        for(int i=0; i<n;i++){
            System.out.println(term+",");
            term=term+d;
        }
    }
}
