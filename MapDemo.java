package Java2.DSA;


import java.util.*;
import java.util.Map.*;

public class MapDemo {
    public static void main(String[] args) {
        // Use TreeMap instead of HashMap
        TreeMap<Integer, String> tm = new TreeMap<>(Map.of(0, "A", 1, "B", 2, "C", 3, "D"));

        tm.put(4, "E");
        tm.put(5, "F");

        Entry<Integer, String> e = tm.firstEntry(); // ✅ now valid for TreeMap

        System.out.println("First Entry: " + e.getKey() + " " + e.getValue());
        System.out.println("Full Map: " + tm);
    }
}
