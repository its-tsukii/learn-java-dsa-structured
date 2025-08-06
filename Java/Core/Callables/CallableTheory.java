package Java.Core.Callables;

public class CallableTheory {
    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);

        thread1.start();
        thread2.start();
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Runnable " + Thread.currentThread().threadId() + " is Running:" + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }

}

/*
 * Callable is powerful than runnable or thread in traditional sense
 * interviewer will first ask thread then runnable then callable and then trap
 * us with asking its differences
 * 
 * runnables and thread both did not return i.e it used a void ... right so they
 * return anything but callables they are different they return a value means we
 * can use a return function or instance.
 */