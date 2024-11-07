package Concurrency4.AdderSubtractorMutex;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client  {
    public static void main(String[] args) throws InterruptedException {
        Count count = new Count();
        Lock lock = new ReentrantLock();

        Adder adder = new Adder(count, lock);
        Subtractor subtractor = new Subtractor(count, lock);

        Thread t1 = new Thread(adder);
        Thread t2 = new Thread(subtractor);
         t1.start();
         t2.start();

         t1.join() ; // this waits till t1 and t2 completed.
         t2.join();
         System.out.println(count.value);


    }
}
