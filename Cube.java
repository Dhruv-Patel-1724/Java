import java.util.Scanner;

public class Cube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the vlaue of 3 side: ");
        int a=sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();

        int x=2*((a*b)+(a*c)+(b*c));
        int v = a*b*c;
        System.out.println(x +  " " +v);
    }
}