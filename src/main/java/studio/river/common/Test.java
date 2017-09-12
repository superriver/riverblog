package studio.river.common;


/**
 * Created by Administrator on 2017/9/5.
 */
public class Test {
    static class YieldThread extends Thread {
        public YieldThread(String name) {
            super(name);
        }

        @Override
        public void run() {
            //System.out.println(Thread.currentThread().getName()+"开始运行......");
            for (int i = 0; i < 50; i++) {
                System.out.println(getName() + ":" + i);
                if(i==20){
                    Thread.yield();
                }

            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
//        for (int i = 0; i < 100; i++) {
//            if(i==50){
//                JoinThread joinThread1 = new JoinThread("被join的新线程");
//                joinThread1.start();
//                joinThread1.join();
//            }
        YieldThread newThread1 = new YieldThread("高级线程");
     //  newThread1.setPriority(Thread.MAX_PRIORITY);


        YieldThread newThread2 = new YieldThread("低级线程");
     newThread2.setPriority(Thread.NORM_PRIORITY);
        newThread1.start();
        newThread2.start();
    }
}
