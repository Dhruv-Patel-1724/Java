import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList <Integer> al = new ArrayList<>(20);
        ArrayList <Integer> al1 = new ArrayList<>(List.of(50,60,60,605));
        al.addAll(al1);
        System.err.println(al.contains(50));
        System.out.println(al.indexOf(605));
        System.out.println(al.lastIndexOf(60));
        System.out.println(al1.size());
        System.out.println(al);

    }
}
