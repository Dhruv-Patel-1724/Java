package Java2.Input_Output;

import java.io.ByteArrayInputStream;

public class ByteStream {
    public static void main(String[] args) {
        byte a[]= {'a','b','c','d'};
        ByteArrayInputStream b= new ByteArrayInputStream(a);
        String str = new String(b.readAllBytes());
        System.out.println(str);
    }
}