package Generics;

public class Pair1 <F, S> {
    private F first;
    private S second;



    public Pair1(F first, S second) {
        this.first = first;
        this.second = second;

    }
    public F getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }
}
