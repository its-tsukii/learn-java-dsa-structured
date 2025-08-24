package Java.Core.Runnables.Synchronization;

public class SynchronizationExample2 {
    public static void main(String[] args) {
        SharedCounter counter = new SharedCounter();
        Runnable task = () -> {
            for (int i = 0; i < 5; i++) {
                counter.increment();
            }
        };

        Thread th1 = new Thread(task, " Thread 1 : ");
        Thread th2 = new Thread(task, " Thread 2 : ");

        th1.start();
        th2.start();
    }
}

class SharedCounter {
    private int counter = 0;

    public void increment() {
        // non critical code can go here
        synchronized (this) { // synchronized block
            counter++;
            System.out.println(Thread.currentThread().getName() + " Count : " + counter);
        }
        // more non critical code can go here
    }
}
