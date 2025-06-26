import java.util.Scanner;

public class Digit_Count {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        n=sc.nextInt();
        while (n>0) {
            int r = n%10;
            n=n/10;
            System.out.print(r);
            

        }
       
    }
}
