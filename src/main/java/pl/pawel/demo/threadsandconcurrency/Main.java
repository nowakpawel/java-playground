package pl.pawel.demo.threadsandconcurrency;

public class Main {
    public static void main(String[] args) {
//        MyRunnable myRunnable1 = new MyRunnable();
//        Thread thread1 = new Thread(myRunnable1, "Thread1");
//
//        MyRunnable myRunnable2 = new MyRunnable();
//        Thread thread2 = new Thread(myRunnable2, "Thread2");
//
//        thread1.start();
//        thread2.start();
//
//        MyRunnable myRunnable = new MyRunnable();
//        Thread thread3 = new Thread(myRunnable, "Thread3");
//        Thread thread4 = new Thread(myRunnable, "Thread4");
//
//        thread3.start();
//        thread4.start();

        printDelimiter("RunnableCounter");

        RunnableCounter runnableCounter = new RunnableCounter();
        Thread runnableThread1 = new Thread(runnableCounter, "RunnableThread1");
        Thread runnableThread2 = new Thread(runnableCounter, "RunnableThread2");

        runnableThread1.start();
        runnableThread2.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.printf("Final value of counter is %d".formatted(runnableCounter.getCounter()));
    }

    private static void printDelimiter(String text) {
        System.out.println("\n======== " + text + " ========\n");
    }
}
