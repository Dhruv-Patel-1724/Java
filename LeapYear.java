import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year:");
        int a = sc.nextInt();

        if (a % 4 == 0) {
            if (a % 100 == 0) {
                if (a % 400 == 0) {
                    System.out.println("It's a leap year");
                } else {
                    System.out.println("Not a leap year");
                }
            } else {
                System.out.println("It's a leap year");
            }
        } else {
            System.out.println("Not a leap year");
        }
    }
}
