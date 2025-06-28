package Java2.Input_Output;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
class Student{
    int roll;
    String name;}
public class ObjectInput {
    public static void main(String[] args) throws Exception {
         FileInputStream f = new FileInputStream("java.txt");
        ObjectInputStream o = new ObjectInputStream(f);
        
      // Read rest as UTF string
        Student s =new Student();
        s = (Student) o.readObject();
        System.out.println("Roll: " + s.roll);
        System.out.println("Name: " + s.name);
    }
    
}
