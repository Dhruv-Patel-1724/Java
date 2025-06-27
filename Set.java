import java.util.ArrayList;
import java.util.List;

public class Set {
    public static void main(String[] args) {
        ArrayList <Integer> a = new ArrayList<>(20);
        ArrayList <Integer> a2 = new ArrayList<>(List.of(47,65,8,2,4));
        a.addAll(a2);
        System.out.println(a.subList(0, 2));
        System.out.println(a);
    }
}
