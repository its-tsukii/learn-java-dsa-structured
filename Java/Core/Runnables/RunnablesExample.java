package Java.Core.Runnables;

public class RunnablesExample {
    public static void main(String[] args) {
        Ping p1 = new Ping();
        Pong p2 = new Pong();

        Thread th1 = new Thread(p1);
        Thread th2 = new Thread(p2);

        th1.start();
        th2.start();
    }
}

class Ping implements Runnable {
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

class Pong implements Runnable {
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