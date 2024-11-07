package Concurrency3;

import org.w3c.dom.css.Counter;

public class Client  {
    public static void main(String[] args) throws InterruptedException {
        Count count = new Count();

        Adder adder = new Adder(count);
        Subtractor subtractor = new Subtractor(count);

        Thread t1 = new Thread(adder);
        Thread t2 = new Thread(subtractor);
         t1.start();
         t2.start();

         t1.join() ; // this waits till t1 and t2 completed.
         t2.join();
         System.out.println(count.value);


    }
}
