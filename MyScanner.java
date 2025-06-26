import java.lang.*;
import java.util.*;
public class MyScanner {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of all datatype: ");
        int a = sc.nextInt();
        float b = sc.nextFloat();
        sc.nextLine();// mendatory
        String c = sc.nextLine();
        System.out.println("This is int:"+a);
        System.out.println("This is Float:"+b);
        System.out.println("This is string:"+c);
    }
}
