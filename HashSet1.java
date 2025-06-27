import java.util.HashSet;

public class HashSet1 {
    public static void main(String[] args) {
        HashSet <Integer> h = new HashSet<>();
        h.add(10);
        h.add(1);
        h.add(10);
        h.add(120);
        h.add(20);
        h.forEach(x->System.out.println(x));
    }
}
