import java.util.LinkedHashSet;

public class LinkedHashSet1 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> h = new LinkedHashSet<>();
        h.add(12);
        h.add(10);
        h.add(10);
        System.out.println(h);
    }
}
