package Generics.tripletExample;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Triplet <String> idNameEmail = new Triplet(
                "1",
                "Rajesh Kumar",
                "nrk8008@gmail.com");

        Triplet <Integer> idAgeRollno = new Triplet(1, 35, 509001 );
        Triplet <Long> idAgeRollNoLong = new Triplet(1L, 35L, 509001L);
        print(idNameEmail);
        print(idAgeRollno);

        List<Triplet<String>> triplets = List.of(idNameEmail, idNameEmail);
        printList(triplets);

        List<Triplet<Long>> tripletsLong = List.of(idAgeRollNoLong, idAgeRollNoLong);
        printList(tripletsLong);

        System.out.println("Avarage value = "+getAverage(idAgeRollno));
        System.out.println("Avarage value = "+getAverage(idAgeRollNoLong));

    }
// This accepts only string type triplet
//    public static void print(Triplet <String> triplet) {
//        System.out.println(triplet.getLeft()+" "+triplet.getRight()+" "+triplet.getMiddle());
//    }

    // this method accepts any type triplets.
    private static <TYPE> void print(Triplet <TYPE> triplet) {
        System.out.println(triplet.getLeft()+" "+triplet.getRight()+" "+triplet.getMiddle());
    }

    private static<TYPE> void printList(List<Triplet <TYPE>> triplets) {
        for (Triplet <TYPE> triplet : triplets) {
            System.out.println(triplet.getLeft() + " " + triplet.getRight() + " " + triplet.getMiddle());
        }
    }

    private static Double getAverage(Triplet<? extends Number > triplet) {
        return ((triplet.getLeft().doubleValue() + triplet.getRight().doubleValue()+ triplet.getMiddle().doubleValue())/3);
    }
}
