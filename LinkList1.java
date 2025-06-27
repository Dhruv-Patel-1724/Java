import java.util.LinkedList;
import java.util.List;
public class LinkList1 {
    public static void main(String[] args) {
        LinkedList<Integer> l=new LinkedList<>();
        LinkedList<Integer> l1 = new LinkedList<>(List.of(12,32,54,65));
        l.addAll(l1);
        l.add(23);
        l.remove(0);

        l.forEach(n->Show(n));
    }
    static void Show(int n){
        System.out.println(n);
    }
}
