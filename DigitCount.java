import java.util.Scanner;

public class DigitCount {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        n = sc.nextInt();
        int count=0;
        while(n>0){
            n=n/10;
            count++;
        }
        System.out.println(count);
    }
}