package Concurrency4.AdderSubtractorSynchronisedMethod;

// This is a third party service.

public class Count {
    private int value = 0;

    public synchronized void increment(int offset) {
        this.value += offset;
    }
    public int getValue() {
        return value;
    }

}

