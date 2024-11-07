package MultiThreading;

public class ThreadWithLambaExample {
    public static void main(String[] args) {
        Thread myThread = new Thread(() -> {
            System.out.println(Thread.currentThread().getName());
        });
        myThread.start();
    }
}
