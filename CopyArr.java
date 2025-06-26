public class CopyArr {
    public static void main(String[] args) {
        int a[]={12,34,65,23,45};
        for(int x:a){
        System.out.print(x+" ");
        }
        int b[]=new int[10];
        for(int i =0;i<a.length;i++){
            b[i]=a[i];
        }
        a=b;
        b[5]=12;
        b[8]=8000;
        System.out.println("");
        for(int x:a){
        System.out.print(x+" ");
        }
}
}
