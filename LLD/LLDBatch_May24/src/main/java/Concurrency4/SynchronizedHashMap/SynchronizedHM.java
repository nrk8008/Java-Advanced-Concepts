package Concurrency4.SynchronizedHashMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SynchronizedHM {
    public static void main(String[] args) throws Exception {
        try{
            Map<String, String> hmap = new HashMap<String, String>();
            hmap.put("1", "value1");
            hmap.put("2", "value2");
            hmap.put("3", "value3");
            hmap.put("4", "value4");
            hmap.put("5", "value5");

            System.out.println("Map: " + hmap);

            Map<String, String> sMap = Collections.synchronizedMap(hmap);

            System.out.println("Synchrozed Map: " + sMap);
        }

        catch(IllegalArgumentException e){
            System.out.println("Exception thrown: "+ e);

        }

    }
}
