package Concurrency4.ConcurrentHashMap;

import java.util.concurrent.ConcurrentHashMap;

public class AddingElementsToConcurrentHashMap {
    public static void main(String[] args) {
        ConcurrentHashMap<String, String> chm = new ConcurrentHashMap<String, String>();
        chm.put("a", "b");
        chm.put("c", "d");
        chm.put("e", "f");
        chm.put("g", "h");
        chm.put("i", "j");
        chm.put("k", "l");

        // Printing the HashMap

        System.out.println("Mappings of chm" + chm);

        //Create another Concurrent HashMap
        ConcurrentHashMap<String, String> new_chm = new ConcurrentHashMap<>();
        //adding all elements of chm to new_chm.
        new_chm.putAll(chm);
        System.out.println("Mappings of new_chm:" + new_chm);

        // removing an element from new_chm

        String valueRemoved = new_chm.remove("i");
        System.out.println("Removed value:" + valueRemoved);
        System.out.println("Mappings of new_chm after removing : " + new_chm);

        valueRemoved = new_chm.remove("m");
        System.out.println("Removed value:" + valueRemoved);
        System.out.println("Mappings of new_chm after removing : " + new_chm);

        // Accessing the elements in a Concurrent HashMap

        System.out.println("value of C  : " + chm.get("c"));

        new_chm.clear();
        System.out.println("Mappings of new_chm after clear() : " + new_chm);
        System.out.println("size of new_chm after clear() : " + new_chm.size());

    }
}
