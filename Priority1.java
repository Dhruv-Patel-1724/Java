import java.util.PriorityQueue;

public class Priority1 {
    public static void main(String[] args) {
        PriorityQueue<Integer> p= new PriorityQueue<>();
p.add(12);
p.add(122);
p.add(1);
p.add(6);
p.poll();
p.forEach(x -> System.out.println(x));
    }
}
