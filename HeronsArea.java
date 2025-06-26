import java.util.Scanner;

public class HeronsArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a,b,c: ");

        float a=sc.nextFloat();
        float b= sc.nextFloat();
        float c = sc.nextFloat();
        float s = (a+b+c)/2f;
        System.out.println(s);
        double Area = Math.sqrt((s*s-a)*(s-b)*(s-c));
        System.out.println(Area);
    }
}
