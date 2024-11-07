package MultiThreading.executers_calliables;

import org.springframework.core.task.SimpleAsyncTaskExecutor;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static java.util.concurrent.Executors.newFixedThreadPool;

public class Client {
    public static void main(String[] args) {
        ExecutorService  exeService = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 100; i++) {
            NumberPrinter numPrinter = new NumberPrinter(i);
            exeService.execute(numPrinter);
        }
        exeService.shutdown();
    }
}
