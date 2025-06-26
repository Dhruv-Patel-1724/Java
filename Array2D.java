public class Add2D {
    public static void main(String[] args) {
        int a[][]={{12,23,45},{12,56,23},{12,34,87}};
        int b[][]={{12,28,45},{12,56,20},{22,34,87}};
        int c[][]=new int[3][3];

        for(int i=0;i <a.length;i++){
            for(int j=0; j<a.length;j++){
c[i][j]=a[i][j]+b[i][j];
System.out.print(c[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
