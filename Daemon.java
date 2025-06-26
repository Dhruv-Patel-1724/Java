package Java2;
class Thred extends Thread{
   public void run(){
        int count=1;
        while (true) {
            System.out.println(count++);
           
        }
    }
    
}
public class Daemon {
    public static void main(String[] args) {
        Thred t = new Thred();
        t.setDaemon(true);
        t.start();
 try {
                Thread.sleep(50);
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println(e);
            }
        
    }
}