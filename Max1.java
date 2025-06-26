public class Max1 {
    public static void main(String[] args) {
        int A[] = {12,34,1,3,8,76,44,5};
        int max1,max2;
        max1=max2=A[0];
        for(int i=0;i<A.length;i++){
            if(A[i]>max1){
                max2=max1;
                max1=A[i];
            }
        }System.out.println(max1);
    }
}
