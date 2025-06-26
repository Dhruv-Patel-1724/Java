import java.util.Scanner;

public class Arra {
    public static void main(String[] args) {
        // int sum=0;
        // int A[] = {1,2,3,4,5,6,7,8};
        // for(int x : A){
        //     sum = sum + x;
            
        // }
        // System.out.println(sum);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the key value;");
        int k = sc.nextInt();
int count = 0;
        int A[]={1,2,3,4,5,6,7};
        for(int x:A){
            if(k==x){
System.out.println("Element found"+x);
count++;
            }
        }
         if (count == 0) {
            System.out.println("Element not found");
        
    }
}
}