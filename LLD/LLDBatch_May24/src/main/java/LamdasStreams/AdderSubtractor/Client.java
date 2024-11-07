package LamdasStreams.AdderSubtractor;

import Concurrency4.AdderSubtractorMutex.Count;

public class Client  {
    public static void main(String[] args) throws InterruptedException {
        Count count = new Count();

        Runnable adderLamda = () -> {
            for(int i=1; i<=10000; i++){
                synchronized (count) {
                    count.value += i;
                }
            }
        };

        Runnable subtractorLamda = () -> {
            for(int i=1; i<=10000; i++){
                synchronized (count){
                    count.value -=i;
                }
            }

        };

        Thread t1 = new Thread(adderLamda);
        Thread t2 = new Thread(subtractorLamda);
         t1.start();
         t2.start();

         t1.join() ; // this waits till t1 and t2 completed.
         t2.join();
         System.out.println(count.value);


    }
}
