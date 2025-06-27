import java.util.ArrayDeque;

public class ArrayDeque1 {
    public static void main(String[] args) {
        ArrayDeque <Integer> d = new ArrayDeque<>();
        d.offerLast(10);
        d.offerLast(20);
        d.offerLast(30);
        d.offerFirst(1);
        d.offerFirst(2);
        d.offerFirst(3);
    d.forEach(x->System.out.println(x));
    }
    
}
