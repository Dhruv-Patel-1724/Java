import java.util.Scanner;

public class Gp_Series {
    public static void main(String[] args) {
        int a,r,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a,r,n value: ");
        a = sc.nextInt();
        r = sc.nextInt();
        n = sc.nextInt();
        int term = a;
        for(int i =0; i<n;i++){
            System.out.println(term);
            term = term*r;
        }
    }
}
