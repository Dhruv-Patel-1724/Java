import java.util.Scanner;

public class RootsQuadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of value:");
        int a= sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        double r1= (-b+Math.sqrt(b*b-4*a*c))/(2*a);
        double r2= (-b-Math.sqrt(b*b-4*a*c))/(2*a);

        System.out.println(r1);
        System.out.println(r2);
    }
}
//enter 1 -4 4