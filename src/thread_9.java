public class thread_9 {
    static long startTime = 0;

    public static void main(String[] args) {
        Thread11_1 th1 = new Thread11_1();
        Thread11_2 th2 = new Thread11_2();
        th1.start();
        th2.start();
        startTime = System.currentTimeMillis();

        try{
            th1.join();
            th2.join();
        } catch(InterruptedException e){}

        System.out.println("소요시간:" + (System.currentTimeMillis()- thread_9.startTime));
    }
}

class Thread11_1 extends Thread{
    public void run(){
        for(int i =0; i<300; i++){
            System.out.print(new String("-"));
        }
    }
}

class Thread11_2 extends Thread{
    public void run(){
        for(int i=0; i<300; i++){
            System.out.println(new String("|"));
        }
    }
}
