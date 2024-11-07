package Concurrency4.ProducerConsumerSemaphore;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Semaphore;

public class Client {
    public static void main(String[] args) {
        //Store
        Queue <Object> store = new ConcurrentLinkedQueue<>();
        Semaphore prodSemaphore = new Semaphore(6);
        Semaphore consSemaphore = new Semaphore(0);

        Producer p1 = new Producer(store, 6, "p1", prodSemaphore, consSemaphore);
        Producer p2 = new Producer(store, 6, "p2", prodSemaphore, consSemaphore);
        Producer p3 = new Producer(store, 6, "p3", prodSemaphore, consSemaphore);

        Consumer c1 = new Consumer(store, 6, "c1", prodSemaphore, consSemaphore);
        Consumer c2 = new Consumer(store, 6, "c2", prodSemaphore, consSemaphore);
        Consumer c3 = new Consumer(store, 6, "c3", prodSemaphore, consSemaphore);
        Consumer c4 = new Consumer(store, 6, "c4", prodSemaphore, consSemaphore);
        Consumer c5 = new Consumer(store, 6, "c5", prodSemaphore, consSemaphore);

        Thread t1 = new Thread(p1);
        t1.start();
        Thread t2 = new Thread(p2);
        t2.start();
        Thread t3 = new Thread(p3);
        t3.start();
        Thread t4 = new Thread(c1);
        t4.start();
        Thread t5 = new Thread(c2);
        t5.start();
        Thread t6 = new Thread(c3);
        t6.start();
        Thread t7 = new Thread(c4);
        t7.start();
        Thread t8 = new Thread(c5);
        t8.start();

        //System.out.println("Completed");
    }
}
