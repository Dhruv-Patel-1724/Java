import java.util.Scanner;

public class Iiff {
     public static void main(String[] args) 
    //{
    //     int a = 11;
    //     if(a%2==0){
    //         System.out.println("it's even");
    //     }else{
    //         System.out.println("it's odd no");
    //     }
    // };
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the age:");
    int a = sc.nextInt();
    if(a>=18 && a<=55){
        System.out.println("it is yong boy");
    }
    else{
        System.out.println("it is not young");
    }
    }
}