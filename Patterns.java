public class Patterns {
    public static void main(String[] args) {
        
        for(int i=6; i>=1;i--){
            for(int j=1;j<=i;j++){
                if(i+j>5)
                System.out.print("*");
                else
                System.out.println("");
            }
        }
        System.out.println("");
    }
}
