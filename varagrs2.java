public class varagrs2 {
    static void  name(String... n){

        for(int i=0;i<n.length;i++)
        {
            System.out.println(n[i]);
        }
    }
    
    public static void main(String[] args) {
        name("reju","dhruv","patel");
    }
}
