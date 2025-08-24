package Java.Core.Runnables.Synchronization;

public class Synchronization implements Runnable {
    static int counter;

    public synchronized void incrementLoop() {
        for (int i = 0; i < 100000; i++) {
            counter++; // we are synchronization this part only so we just have to find the critical
                       // point and then do synchronization
        }
    }

    public void run() {
        incrementLoop();
    }

    public static void main(String[] args) throws InterruptedException {
        Synchronization task = new Synchronization();
        Thread th1 = new Thread(task);
        Thread th2 = new Thread(task);

        th1.start();
        th2.start();

        th1.join();
        th2.join();

        System.out.println("Expected : " + 200000);
        System.out.println("Actual : " + counter);
    }
}
