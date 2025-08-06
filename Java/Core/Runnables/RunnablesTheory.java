package Java.Core.Runnables;

public class RunnablesTheory {
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
 * pros :
 * 1. This fixed the issue where we cannot extend to more classes rather we make
 * the object myrunnable and wrap it into thread as a task that way we can
 * implement more objects
 * implements is same as extends but implements is mostly used for interfaces
 * and inherits some methods unlike extends that inherit everything
 * we never always use this method in production this is for beginner only
 */

/*
 * assume an example or the analogy of car and road so the thread is the literal
 * what i mean is that here thread is the road ... while runnable is the car so
 * we pass the car onto the road simple as that , basically in cs terms runnable
 * is an task or a job which we wrap as a task and send towards thread, thread
 * has 'extends' while runnable has 'implements' so runnable is an interface ,
 * more importantly runnable is not the same as threads as thread is a literal
 * thread and runnable is just a task/job
 */