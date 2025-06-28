package Java2.Input_Output;

import java.io.*;

public class DataInput {
    public static void main(String[] args) throws Exception {
        FileInputStream f = new FileInputStream("java.txt");
        DataInputStream d = new DataInputStream(f);
        
        int roll = d.readInt();         // Read 4 bytes
        String name = d.readUTF();      // Read rest as UTF string
        
        System.out.println("Roll: " + roll);
        System.out.println("Name: " + name);
    }
}
