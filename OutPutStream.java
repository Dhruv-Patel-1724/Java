package Java2.Input_Output;

import java.io.FileOutputStream;
import java.io.IOException;

public class OutPutStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream o = new FileOutputStream("java.txt");
        String str ="Dhruv is coming ok";
        o.write(str.getBytes());
        o.close();
    }
}
