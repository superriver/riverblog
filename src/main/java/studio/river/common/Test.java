package studio.river.common;

/**
 * Created by Administrator on 2017/9/5.
 */
public class Test  {
    static class JoinThread extends Thread{
        public JoinThread(String name){
            super(name);
        }

        @Override
        public void run() {
            for (int i = 0; i < 20; i++) {
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            if(i==50){
                JoinThread joinThread1 = new JoinThread("被join的新线程");
                joinThread1.start();
                joinThread1.join();
            }
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}
