package MultiThreading.IntroToThread1;

public class NumberPrinter implements Runnable {
    int number;
    NumberPrinter(int n) {
        this.number = n;

    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ": " + number);
    }
}
