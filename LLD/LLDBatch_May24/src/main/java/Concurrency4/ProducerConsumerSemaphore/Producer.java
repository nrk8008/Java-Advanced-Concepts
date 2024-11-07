package Concurrency4.ProducerConsumerSemaphore;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Producer implements Runnable {
    private Queue<Object> store;
    private int maxSize;
    private String name;
    private Semaphore prodSemaphore;
    private Semaphore consSemaphore;
    public Producer(Queue<Object> store, int maxSize, String name, Semaphore prodSemaphore, Semaphore consSemaphore) {
        this.store = store;
        this.maxSize = maxSize;
        this.name = name;
        this.prodSemaphore = prodSemaphore;
        this.consSemaphore = consSemaphore;

    }


    @Override
    public void run() {
        while(true) {

            try {
                prodSemaphore.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
                    System.out.println(this.name + " is adding an element :" + store.size());
                    store.add(new Object());

            consSemaphore.release();


    }

    }
}
