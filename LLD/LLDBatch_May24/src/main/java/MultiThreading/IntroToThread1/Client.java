package MultiThreading.IntroToThread1;

public class Client {
    public static void main(String[] args) {
        HelloWorldPrinter h = new HelloWorldPrinter();
        //for (int i = 0; i < 10000; i++) {
            Thread t = new Thread(h);
            t.start();
        //}
        for (int i = 0; i < 10; i++) {
           Thread t2 = new HelloWorldPrinter2();
           t2.start();
        }
         for (int i = 0; i < 100; i++) {
            NumberPrinter r = new NumberPrinter(i);
            Thread t2 = new Thread(r);
            t2.start();
        }
    }
}
