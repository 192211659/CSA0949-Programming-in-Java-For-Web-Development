class LowPriorityThread extends Thread {
    public void run() {
        System.out.println("Low Priority Thread started.");
        for (int i = 0; i < 5; i++) {
            System.out.println("Low Priority Thread: Count " + i);
            try {
                Thread.sleep(100); // Simulate work
            } catch (InterruptedException e) {
                System.out.println("Low Priority Thread interrupted.");
            }
        }
        System.out.println("Low Priority Thread finished.");
    }
}

class HighPriorityThread extends Thread {
    public void run() {
        System.out.println("High Priority Thread started.");
        for (int i = 0; i < 5; i++) {
            System.out.println("High Priority Thread: Count " + i);
            try {
                Thread.sleep(50); // Simulate work
            } catch (InterruptedException e) {
                System.out.println("High Priority Thread interrupted.");
            }
        }
        System.out.println("High Priority Thread finished.");
    }
}

public class ThreadPriorityExample {
    public static void main(String[] args) {
        LowPriorityThread lowPriorityThread = new LowPriorityThread();
        HighPriorityThread highPriorityThread = new HighPriorityThread();

        // Set thread priorities
        lowPriorityThread.setPriority(Thread.MIN_PRIORITY);  // Lower priority (1)
        highPriorityThread.setPriority(Thread.MAX_PRIORITY); // Higher priority (10)

        // Start the low priority thread
        lowPriorityThread.start();
        
        // Wait for a moment to ensure the low priority thread starts first
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // Start the high priority thread
        highPriorityThread.start();

        // Wait for both threads to finish
        try {
            lowPriorityThread.join();
            highPriorityThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread finished.");
    }
}
