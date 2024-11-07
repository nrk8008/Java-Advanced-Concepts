package Generics.GenericMethods;

public class Main {
    public static void main(String[] args) {
        Integer[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] stringArray = {"A", "B", "C", "D", "E", "F"};

        Util util = new Util();
        util.printArray(array1);
        util.printArray(stringArray);
    }
}
