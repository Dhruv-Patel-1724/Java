package Java2;
class MyTread extends Thread
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
public class Threadd {
    public static void main(String[] args) {
        MyTread t = new MyTread();
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
