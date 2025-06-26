import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        int r;
        int n;
        int rev=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        n = sc.nextInt();
        int m=n;
         while(n>0){
            r=n%10;
            rev=rev*10+r;
            n=n/10;
         }
         if(rev==m){
            System.out.println("yes it is");
         }else{
            System.out.println("not");
         }
    }
}
