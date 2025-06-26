public class Methods {
    static int max(int x,int y){
        if(x>y)
        return x;
        else
        return y;
    }

    public static void main(String[] args) {
        int x=10,y=91;
        int s = max(x,y);
        System.out.println(s);
    }
}
