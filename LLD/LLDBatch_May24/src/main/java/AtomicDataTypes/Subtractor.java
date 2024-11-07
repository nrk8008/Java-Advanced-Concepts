package AtomicDataTypes;

import java.util.concurrent.locks.Lock;

public class Subtractor implements Runnable {
    private Count count;


    public Subtractor(Count count) {

        this.count = count;

    }

    @Override
    public void run() {
        for (int i = 1; i <= 100000; i++) {
            count.value.addAndGet(-i);
            System.out.println("Removed the value = "+i);
        }
    }
}
