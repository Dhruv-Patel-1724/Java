import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value: ");
        n = sc.nextInt();
        int m=n;
        int sum=0;
        while(n>0){
            int r = n%10;
            n=n/10;
            sum= sum+r*r*r;
        }
        if(sum == m){
            System.out.println("It is armstronh");
        }else{
            System.out.println("not armstrong");
        }
        
        }
}
