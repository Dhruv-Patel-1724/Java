import java.util.Scanner;

public class FiindGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enteer the marks of 3 suj:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = a+b+c;
        System.out.println("total"+d);
        float avg = d/3;
        if(avg>=50 && 60>=avg){
            System.out.println("c grade");
        }else if(avg>=60 && 70>=avg){
            System.out.println("B grade");
        }else{
            System.out.println("A gread");
        }
    }
}
