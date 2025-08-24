package Java.Core.Runnables.Synchronization;

import java.util.Random;

public class RaceConditionDemo {
    // Shared accounts array
    static double[] accounts = new double[100];

    static boolean transfer(double amount, int source, int target) {
        if (accounts[source] < amount) {
            return false;
        }
        // Intentional race condition: No synchronization
        accounts[source] -= amount;
        try {
            // small delay to amplify the race condition
            Thread.sleep(1);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        accounts[target] += amount;
        return true;
    }

    static double audit() {
        double balance = 0.00;
        for (int i = 0; i < accounts.length; i++) {
            balance += accounts[i];
            try {
                // small delay to make audit inconsistent more often
                Thread.sleep(1);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        return balance;
    }

    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();
        // Initialize each amount with some money
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = 1000.0;
        }
        // Initial audit
        double initialBalance = audit();
        System.out.println("Initial Total Balance : " + initialBalance);
        // create Threads to perform random transfers (source and target may be same)
        Thread th1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                int source = random.nextInt(accounts.length);
                int target = random.nextInt(accounts.length);
                transfer(5.00, source, target);
            }
        });
        Thread th2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                int source = random.nextInt(accounts.length);
                int target = random.nextInt(accounts.length);
                transfer(5.00, source, target);
            }
        });

        // Auditor Thread
        Thread auditor = new Thread(() -> {
            for (int i = 0; i < 50; i++) {
                double total = audit();
                System.out.println("Audit Total : " + total);
            }
        });
        // Start Threads
        th1.start();
        th2.start();
        auditor.start();
        // wait for completion
        th1.join();
        th2.join();
        auditor.join();
        // final audit
        double finalBalance = audit();
        System.out.println("Final Total Balance : " + finalBalance);
    }
}
