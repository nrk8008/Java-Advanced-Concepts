package Concurrency4.ConcurrentHashMap;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHMDemo {
    public static void main(String[] args) {
        ConcurrentHashMap <Integer, String> chm = new ConcurrentHashMap();
        chm.put(1, "one");
        chm.put(2, "two");
        chm.put(3, "three");

        chm.put(3, "four");

        chm.remove(3);
        chm.put(4, "four");

        chm.replace(4, "four", "five");
        System.out.println(chm);
    }
}
