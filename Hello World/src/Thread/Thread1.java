package Thread;

public class Thread1 {
    public static void main(String[] args) throws InterruptedException {
//        MyThread thread = new MyThread();
//        thread.start();
//        Thread.sleep(1000);
//        System.out.println("done");
        Runner runner = new Runner();
        Thread thread = new Thread(runner);
        thread.start();
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hi from Thread " + Thread.currentThread().getName());
        }
    }
}

class Runner implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hi from Runner " + Thread.currentThread().getName());
        }
    }
}