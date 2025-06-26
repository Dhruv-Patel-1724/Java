package Java2;
class MyTread implements Runnable
{
    public void run(){
        int i =1;
        while (true) {
            System.out.println(i+"Dhruv");
            i++;
             try {
                Thread.sleep(300);  // same delay as other thread
            } catch (Exception e) {}
        }
    }
}
public class Runnebal {
    public static void main(String[] args) {
        MyTread m = new MyTread();
        Thread t =new Thread(m);
        t.start();
        int i=1;
        while (true) {
            System.out.println(i+"Patel");
            i++;
             try {
                Thread.sleep(300);  // same delay as other thread
            } catch (Exception e) {}
        }
    }
}
