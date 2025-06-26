import java.util.Scanner;

public class Switchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the web name?:");
        String str= sc.nextLine();
        String str2 =str.substring(str.lastIndexOf(".")+1); 

        switch (str2) {
            case "com":System.out.println("Common");
                
                break;
            case "org":System.out.println("orgine");
            break;
        
            default:
                break;
        }
    }
}
