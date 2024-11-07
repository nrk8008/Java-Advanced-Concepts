package MultiThreading.Runnable;

public class Client {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });

        t1.start();
    }
}
