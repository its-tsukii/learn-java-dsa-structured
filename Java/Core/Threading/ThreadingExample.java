package Java.Core.Threading;

public class ThreadingExample {
    public static void main(String[] args) {
        // Ping th1 = new Ping();
        Thread thread1 = new Ping();
        Thread thread2 = new Pong();
        // thread1.start();
        // thread2.start();
        thread1.run();
        thread2.run();

        // we use .start() for concurrent and .run() for sequential
        // both are part of java.lang
        // we just override run
    }
}

class Ping extends Thread {
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(" PING ");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // TODO: handle exception
            }
        }
    }
}

class Pong extends Thread {
    public void run() {
        for (int i = 0; i <= 10; i++) {
            // for (;;) { this is just way of saying an infinite loop
            System.out.println(" PONG ");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // TODO: handle exception
            }
        }
    }
}