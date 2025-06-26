import java.util.*;
public class FormatedOut {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of all datatype: ");
        int a = sc.nextInt();
        float b = sc.nextFloat();
        sc.nextLine();// mendatory
        String c = sc.nextLine();
        System.out.printf("This is int,float and string %3$s %1$d %2$f  okay",a,b,c);
      int w=34;
int q=23;
        System.out.printf("%5d",w);// 5 space chod se pchi 34 acse
        System.out.printf("%-5d",q);//23 avse pachi 5 space chod se
    }
}


