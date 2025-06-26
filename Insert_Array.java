public class Insert {
    public static void main(String[] args) {
    //     int A[] = new int[10];  // array with extra space
    //     A[0] = 12;
    //     A[1] = 13;
    //     A[2] = 34;
    //     A[3] = 6;

    //     int n = 4;              // current number of elements
    //     int x = 200;            // value to insert
    //     int index = 2;          // position where to insert

    //     System.out.println("Original Array:");
    //     for (int i = 0; i < n; i++) {
    //         System.out.print(A[i] + " ");
    //     }

    //     // shift elements to the right
    //     for (int i = n; i > index; i--) {
    //         A[i] = A[i - 1];
    //     }

    //     // insert value
    //     A[index] = x;
    //     n++;  // increase total count after insertion

    //     System.out.println("\nArray after insertion:");
    //     for (int i = 0; i < n; i++) {
    //         System.out.print(A[i] + " ");
    //     }

    int a[]= new int[10];
    a[0]=23;a[1]=34;a[2]=65;a[3]=9;a[4]=8;
    int x=200;
    int index = 2;
    int n = 5;

    for(int i=0;i<n;i++){
        System.out.print(a[i]+" ");
    }
    for(int i=n;i>index;i--){
        a[i]=a[i-1];
    }
    a[index]=x;
    n++;
    System.out.println("");
    for(int i=0;i<n;i++){
        System.out.print(a[i]+" ");
    }
}
}
