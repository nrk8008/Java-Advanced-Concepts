package Concurrency4.AdderSubtractorSynchronisedMethod;

public class Client  {
    public static void main(String[] args) throws InterruptedException {
        Count count = new Count();


        Adder adder = new Adder(count);
        Subtractor subtractor = new Subtractor( count);

        Thread t1 = new Thread(adder);
        Thread t2 = new Thread(subtractor);
         t1.start();
         t2.start();

         t1.join() ; // this waits till t1 and t2 completed.
         t2.join();
         System.out.println(count.getValue());
         System.out.println("Bye");

    }
}
