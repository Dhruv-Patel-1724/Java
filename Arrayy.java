public class Arrayy {
        public static void main(String[] args) {
            int a[]=new int [5];
            int []A={1,2,3,4,5,6};
            for(int i=A.length-1;i>=0;i--){
                System.out.println(A[i]);
            }
            for(int x:A){
                System.out.print(x);
            }
        }
    }

