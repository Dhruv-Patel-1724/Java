package Java2.Input_Output;

import java.io.FileInputStream;

public class InputStream {
    
public static void main(String[] args) throws Exception {
    FileInputStream fi = new FileInputStream("java.txt");
    byte b[] = new byte [fi.available()];
    fi.read(b);
    String str = new String(b);
    System.out.println(str);
    
}
}
