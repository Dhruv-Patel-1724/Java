import java.util.Scanner;

public class AddNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter value of a and b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a + b;
        System.out.println("sum of two number is: "+c);
    }
}
