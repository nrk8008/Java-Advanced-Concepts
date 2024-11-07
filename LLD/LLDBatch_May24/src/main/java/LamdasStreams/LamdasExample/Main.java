package LamdasStreams.LamdasExample;

public class Main {
    public static void main(String[] args) {
        SomethingDoer somethingDoer = new SomethingDoer();
        Thread t1 = new Thread(somethingDoer);
        t1.start();


        Runnable runnable = () -> {
            System.out.println("Do Something v2");
        };
        Thread t2 = new Thread(runnable);
        t2.start();

        Thread t3 = new Thread(
                ()-> {
                    System.out.println("Do Something v3");
                }
        );
        t3.start();
    }
}
