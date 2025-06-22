package Java.Core.Threading;

public class Threading {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        thread1.start();
        MyThread thread2 = new MyThread();
        thread2.start();
    }

}

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread " + Thread.currentThread().threadId() + " is Running:" + i);
        }
    }

}