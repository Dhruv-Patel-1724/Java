public class Overlod {
    static int max(int a ,int b){
if(a>b)
return a;
else
return b;
    }
    static int max(int c){
int f = c+3;
return f;
    }
    public static void main(String[] args) {
        System.out.println(max(2,5));
        System.out.println(max(20));
    }
}
