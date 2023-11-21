package thread;

public class thread_7 {
    public static void main(String[] args) {
        Thread8_1 th1 = new Thread8_1();
        Thread8_2 th2 = new Thread8_2();
        th1.start(); th2.start();

        try{
            th1.sleep(2000);
        } catch(InterruptedException e){}
        System.out.print("<<main 종료>>");
    }
}

class Thread8_1 extends Thread{
    public void run(){
        for(int i=0; i<300; i++) System.out.println("-");
        System.out.println("<<th1 종료>>");
    }
}

class Thread8_2 extends Thread{
    public void run(){
        for(int i =0; i<300; i++) System.out.println("|");
        System.out.println("<<th2 종료>>");
    }
}
