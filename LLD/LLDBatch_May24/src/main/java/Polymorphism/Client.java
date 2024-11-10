package Polymorphism;
import java.awt.*;
import java.util.*;
import java.util.List;

public class Client {
    public static void main(String[] args) {


    List<Shape> shapes = new ArrayList<>();
    Shape circle = new Circle();
    Shape square = new Square();

    shapes.add(circle);
    shapes.add(square);


    for(Shape s:shapes) {
        s.draw();
        System.out.println(s.name());
    }
}

}
