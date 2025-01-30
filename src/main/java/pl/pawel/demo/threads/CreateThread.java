package pl.pawel.demo.threads;

public class CreateThread {
    public static class MyThread extends Thread {
        public void run() {
            System.out.println("MyThread running");
            System.out.println("MyThread stopped");
        }
    }

    public static class RunnableThread implements Runnable {
        @Override
        public void run() {
            System.out.println("Runnable thread running");
            System.out.println("Runnable thread stopped");
        }
    }

    public static void main(String[] args) {

        //1
        MyThread thread = new MyThread();
        thread.start(); //invoke run method from thread


        //2
        Thread runnableThread = new Thread(new RunnableThread());
        runnableThread.start();

        //3
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous thread running");
                System.out.println("Anonymous thread stopped");
            }
        };

        Thread anonymousThread = new Thread(runnable);

        anonymousThread.start();

        //4 lambda....
        Runnable lambdaThread = () -> {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " running");
            try {
                Thread.sleep(2500);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }

            System.out.println(threadName + " finished");
        };

        Thread lambda = new Thread(lambdaThread, "Lambda Thread 1");
        lambda.start();

        Thread lambda2 = new Thread(lambdaThread, "Lambda Thread 2");
        lambda2.start();

    }

}
