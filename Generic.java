package Java2;

import java.util.*;

public class Generic<T> {
    List<T> data = new ArrayList<>();

    public static void main(String[] args) {
        Generic<String> g = new Generic<>();
        g.data.add("Dhruv");
        g.data.add("Patel");
        g.data.add("23");
        

        for(String s : g.data){
            System.out.println(s);
        }
    }
}
