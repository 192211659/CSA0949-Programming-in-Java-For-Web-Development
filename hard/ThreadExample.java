class FibonacciThread extends Thread {
    public void run() {
        System.out.println("Fibonacci Series (First 10 Terms):");
        int n1 = 0, n2 = 1;
        System.out.print(n1 + ", " + n2);
        for (int i = 2; i < 10; i++) {
            int n3 = n1 + n2;
            System.out.print(", " + n3);
            n1 = n2;
            n2 = n3;
        }
        System.out.println();
    }
}

class ReverseOrderThread extends Thread {
    public void run() {
        System.out.println("Numbers from 10 to 1 in Reverse Order:");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        // Create thread instances
        Thread fibonacciThread = new FibonacciThread();
        Thread reverseOrderThread = new ReverseOrderThread();

        // Start the threads
        fibonacciThread.start();
        reverseOrderThread.start();

        // Wait for threads to finish
        try {
            fibonacciThread.join();
            reverseOrderThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
