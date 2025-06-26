public class Varagrs {
    static int sum(int... A){
        int su=0;
        for(int i=0;i<=A.length;i++){
            su=su+i;
        }
        return su;
    }
    public static void main(String[] args) {
        System.out.println(sum(1,2,3,4));
    }
}
