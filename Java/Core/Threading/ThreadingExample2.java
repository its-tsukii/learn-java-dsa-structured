package Java.Core.Threading;

public class ThreadingExample2 {
    public static void main(String[] args) throws InterruptedException {
        Thread th1 = new Print(100);
        Thread th2 = new Print(200);
        th1.start();
        for (int i = 300; i < 310; i++) {
            System.out.print(" " + i + " ");
            Thread.sleep(500);
        }
        th2.start();
    }
}

class Print extends Thread {
    private int start;

    public Print(int i) {
        this.start = i;
    }

    public void run() {
        try {
            for (int i = start; i <= start + 10; i++) {
                System.out.print(" " + i + " ");
                Thread.sleep(500);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}