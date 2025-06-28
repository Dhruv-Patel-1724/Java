package Java2.Input_Output;
import java.io.DataOutputStream;
import java.io.FileOutputStream;

class Student{
    int roll;
    String name;
}
public class DataOutput {
    public static void main(String[] args) throws Exception {
        
FileOutputStream f = new FileOutputStream("java.txt");
DataOutputStream d = new DataOutputStream(f);
        Student s = new Student();
        s.roll=10;s.name="Dhru";
        d.writeInt(s.roll);
        d.writeUTF(s.name);
        
    }
}
