import java.util.Scanner;

public class Revers2 {
    public static void main(String[] args) {
        int r;
        int rev=0;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        n = sc.nextInt();

        while(n>0){
            r = n%10;
            rev = rev*10+r;
            n=n/10;
        }
        System.out.println(rev);
    }
}
