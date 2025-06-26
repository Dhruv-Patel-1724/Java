package Java2;

import java.io.FileInputStream;
 

public class Uncheck_Exception {
     static void fun(){
        try {
            FileInputStream fi = new FileInputStream("My.txt");
            
        } catch (Exception e) {
            // TODO: handle exceptionsysy
            System.out.println("File not found"+e);
        }
    }
    public static void main(String[] args) {
        fun();
    }
}

