package Java2;

import java.util.Arrays;
import java.util.List;

public class Unbound {
    public static void Data(List<?> list){
        for (Object i : list){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Dhruv","Patel","Ram");
        List<Integer> nu = Arrays.asList(12,3,45,23);
        Data(names);
        Data(nu);
    }
}
