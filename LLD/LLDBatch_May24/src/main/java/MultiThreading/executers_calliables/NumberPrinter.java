package MultiThreading.executers_calliables;

public class NumberPrinter implements Runnable {
    private int numberToPrint;

      public NumberPrinter(int x){
        numberToPrint = x;
      }

    @Override
    public void run() {
        System.out.println("Printing "+ this.numberToPrint + ". Printed by "+ Thread.currentThread().getName());
    }
}
