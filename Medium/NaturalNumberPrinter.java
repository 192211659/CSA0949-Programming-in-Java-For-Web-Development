class NaturalNumberPrinter extends Thread {
    private int start;
    private int increment;

    public NaturalNumberPrinter(int start, int increment) {
        this.start = start;
        this.increment = increment;
    }

    @Override
    public void run() {
        for (int i = start; i <= 30; i += increment) {
            System.out.println("Thread " + Thread.currentThread().getName() + ": " + i);
            try {
                // Sleep for 100 milliseconds to simulate some delay
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // Restore interrupted status
            }
        }
    }

    public static void main(String[] args) {
        // Create three threads, each responsible for printing natural numbers
        Thread thread1 = new NaturalNumberPrinter(1, 3);  // Prints 1, 4, 7, ...
        Thread thread2 = new NaturalNumberPrinter(2, 3);  // Prints 2, 5, 8, ...
        Thread thread3 = new NaturalNumberPrinter(3, 3);  // Prints 3, 6, 9, ...

        // Start the threads
        thread1.start();
        thread2.start();
        thread3.start();
        
        // Optionally wait for threads to finish (not necessary for this example)
        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Restore interrupted status
        }
    }
}
