package Java.Core.Runnables.Synchronization;

public class SimpleRaceCondition implements Runnable {
    static int counter;

    public void incrementLoop() {
        for (int i = 0; i < 100000; i++) {
            counter++; // this is the critical point
        }
    }

    public void run() {
        incrementLoop();
    }

    public static void main(String[] args) throws InterruptedException {
        SimpleRaceCondition task = new SimpleRaceCondition();
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

// what happens is that we run in an critical state where the object is accessed
// at the same time causing only value to be synchronized due to concurrency
// solution to this is to use synchronization explained in the next program
