package thread;

public class thread_1 {
    public static void main(String[] args) {
        thread1 t1 = new thread1();

        Runnable r = new thread2();
        Thread t2 = new Thread(r);

        t1.start();
        t2.start();
    }
}

class thread1 extends Thread{
    public void run(){
        for(int i =0; i<5; i++){
            System.out.println(getName());
        }
    }
}

class thread2 implements Runnable{
    public void run(){
        for(int i=0; i<5; i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
