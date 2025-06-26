public class NonStaticMethod {
    int max(int a,int b){
        if(a>b)
        return a;
        else
        return b;
    }
    public static void main(String[] args) {
        int a=10,b=20;
        NonStaticMethod j = new NonStaticMethod();
        System.out.println(j.max(a,b));
    }
}
