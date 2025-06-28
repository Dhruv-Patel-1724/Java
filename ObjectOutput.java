package Java2.Input_Output;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
class Student{
    int roll;
    String name;
}
public class ObjectOutput {
    public static void main(String[] args) throws Exception {
        FileOutputStream f = new FileOutputStream("java.txt");
        ObjectOutputStream o = new ObjectOutputStream(f);
        Student s = new Student();
        s.roll=101;s.name="Patel";
        o.writeInt(s.roll);
        o.writeUTF(s.name);
    }
}
