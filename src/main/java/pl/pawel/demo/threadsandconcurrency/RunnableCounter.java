package pl.pawel.demo.threadsandconcurrency;

public class RunnableCounter implements Runnable {
    private volatile int counter;

    public int getCounter() {
        return counter;
    }

    @Override
    public void run() {
        long startTime = System.nanoTime();

        for (int i = 0; i < 1_000_000; i++) {
            synchronized (this) {
                counter++;
            }
        }

        long elapsedTime = System.nanoTime() - startTime;

        System.out.printf("\n%s increased the counter up to: %d in %d miliseconds.\n"
                .formatted(Thread.currentThread().getName(), counter, elapsedTime/1000000));
    }
}
