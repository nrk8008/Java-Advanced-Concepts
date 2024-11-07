package Generics;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        Pair p1 = new Pair(1L , "Alok"); // Long, String
        Pair p2 = new Pair(1.4, 1.5); // double, double
        Pair p3 = new Pair(1L, false); // Long, boolean

        List <Pair> pairs = List.of(p1, p2, p3);
        for(Pair pair : pairs) {
            String first = (String) pair.getFirst();
            String second = (String) pair.getSecond();
        }

        Pair1<Integer, String> pair1 = new Pair1<>(1, "Alok");
        Pair1<Double, Double> pair2 = new Pair1<>(1.4, 1.5) ;
        Pair1 <Long, Boolean> pair3 = new Pair1<>(1L, true);

        List<Pair1> pairNew = List.of(pair1, pair2, pair3);

        for(Pair1 pair : pairNew) {
            System.out.println(pair.getFirst());
            System.out.println(pair.getSecond());
        }

    }
}
