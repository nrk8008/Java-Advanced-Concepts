package Generics.GenericClasses;


public class Client {
    public static void main(String[] args) {

        // creating instance for box class with int Type.
        Box<Integer> intBox = new Box<>();

        intBox.addContent(42);
        System.out.println("Box Content: "+intBox.getContent());

        // creating instance for box class with String type.

        Box<String> stringBox = new Box<>();
        stringBox.addContent("Hello Generics!!");
        System.out.println("Box Content: "+stringBox.getContent());

    }
}
