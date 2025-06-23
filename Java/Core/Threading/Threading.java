package Java.Core.Threading;

public class Threading {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();
        thread1.start();
        thread2.start();
    }

}

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread " + Thread.currentThread().threadId() + " is Running:" + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }

}

/*
 * cons :
 * 1. we cannot extend an another class as java does not support this and thus
 * runnable came into existence.
 */

/*
 * assume an example or the analogy of car and road so the thread is the literal
 * what i mean is that here thread is the road ...
 */