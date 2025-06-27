package Java2;

import java.util.Arrays;
import java.util.List;

public class UpperBound {
    public static void m(List<? extends Number> list){
        for(Object r : list){
            System.out.println(list);
        }

    }

    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(12,4,23,65,67);
        List<Double> numbers = Arrays.asList(1.2,4.0,2.3,6.5,6.7);
       m(number);
       m(numbers);
    }
}
