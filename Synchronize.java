package Java2;
class MyThreas1  {
    public synchronized void display(String str){
        for(int i=0;i<str.length();i++){
            {
                System.out.print(str.charAt(i));
            }
    }

    }
}class MyThread2 extends Thread{
    MyThreas1 d;
    public MyThread2(MyThreas1 d){
        this.d=d;
    }public void run(){d.display("Dhruv Patel");}

}
class MyThread3 extends Thread{
    MyThreas1 d;
    public MyThread3(MyThreas1 d){
        this.d=d;
    }public void run(){d.display("Hello");}

}
public class Synchronize {
    public static void main(String[] args) {
        MyThreas1 m= new MyThreas1();
        MyThread2 t1 =new MyThread2(m);
        MyThread3 t2 =new MyThread3(m);
        t1.start();
        t2.start();
    }
}
