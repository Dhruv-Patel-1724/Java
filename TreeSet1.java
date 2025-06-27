import java.util.TreeSet;

public class TreeSet1 {
    public static void main(String[] args) {
        TreeSet <Integer> t = new TreeSet<>();
        t.add(5);
        t.add(4);
        t.add(3);
        t.add(2);

        t.forEach(x->System.out.println(x));
    }
}
