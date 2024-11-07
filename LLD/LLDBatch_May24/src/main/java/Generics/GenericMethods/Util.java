package Generics.GenericMethods;

public class Util {
    public <E> void printArray(E[] array) {
        for(E element : array) {
            System.out.print(element+", ");
        }
        System.out.println();
    }
}
