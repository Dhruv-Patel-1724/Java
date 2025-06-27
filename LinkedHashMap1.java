import java.util.LinkedHashMap;

public class LinkedHashMap1 {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> l = new LinkedHashMap<>();
        l.put(3, "Dhiru");
        l.put(1, "patel");
        l.put(0, "er");
        l.put(0, "er");
        System.out.println(l);
    }
}
