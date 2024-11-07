package Concurrency4.ProducerConsumerSemaphore;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Consumer implements Runnable {
    private Queue<Object> store;
    private int maxSize;
    private String name;
    private Semaphore prodSemaphore;
    private Semaphore consSemaphore;
    public Consumer (Queue<Object> store, int maxSize, String name, Semaphore prodSemaphore, Semaphore consSemaphore) {
        this.store = store;
        this.maxSize = maxSize;
        this.name = name;
        this.consSemaphore = consSemaphore;
        this.prodSemaphore = prodSemaphore;
    }
    @Override
    public void run() {
        while(true){

            try {
                consSemaphore.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
                    System.out.println(this.name + " is removing an element:" + store.size());
                    store.poll();
            prodSemaphore.release();

        }

    }
}
