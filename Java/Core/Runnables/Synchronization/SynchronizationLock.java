package Java.Core.Runnables.Synchronization;

public class SynchronizationLock implements Runnable {
    static int counter = 0;
    Object lock = new Object();

    public void incrementLoop2() {
        synchronized (lock) {
            for (int i = 0; i < 100000; i++) {
                counter++; // basically we using an object or more likely passing the whole as a object so
                           // it locks the state due to which it cannot be accessed by any other function
                           // thus effectively achieving synchronization
            }
        }
    }

    public void incrementLoop() {

        for (int i = 0; i < 100000; i++) {
            synchronized (lock) {
                counter++; // basically we using an object or more likely passing the whole as a object so
                           // it locks the state due to which it cannot be accessed by any other function
                           // thus effectively achieving synchronization

            }
        }
    }

    public void run() {
        incrementLoop();
    }

    public static void main(String[] args) throws InterruptedException {
        SynchronizationLock task = new SynchronizationLock();
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
