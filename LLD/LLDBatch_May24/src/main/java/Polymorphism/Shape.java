package Polymorphism;

public interface Shape {
    String name();
    default void draw() {
        System.out.println("Drawing a Shape");
    }
}
