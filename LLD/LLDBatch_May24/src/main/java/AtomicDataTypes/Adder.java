package AtomicDataTypes;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable {
    private Count count;

    public Adder(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        for(int i = 1; i <= 100000; i++) {

            count.value.addAndGet(i);
            System.out.println("Added the value = "+i);

        }

    }

}
